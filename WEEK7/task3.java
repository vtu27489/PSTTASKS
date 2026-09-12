import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {
    
    // Maps customer ID -> Pair of (Start Station Name, Check-in Time)
    private final Map<Integer, PassengerCheckIn> checkInMap;
    
    // Maps "StartStation->EndStation" -> Pair of [Total Time, Trip Count]
    private final Map<String, double[]> routeMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        routeMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        // Store the active trip for the passenger
        checkInMap.put(id, new PassengerCheckIn(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        // Retrieve and remove the passenger's check-in details
        PassengerCheckIn checkInInfo = checkInMap.remove(id);
        
        String startStation = checkInInfo.stationName;
        int startTime = checkInInfo.time;
        int travelTime = t - startTime;
        
        // Generate a unique key for this specific route
        String routeKey = startStation + "->" + stationName;
        
        // Update the total accumulated time and total trip count for this route
        routeMap.putIfAbsent(routeKey, new double[2]); // [totalTime, tripCount]
        double[] routeStats = routeMap.get(routeKey);
        
        routeStats[0] += travelTime; // Accumulate total time
        routeStats[1] += 1;          // Increment trip count
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String routeKey = startStation + "->" + endStation;
        double[] routeStats = routeMap.get(routeKey);
        
        // Average Time = Total Time / Total Trips
        return routeStats[0] / routeStats[1];
    }
    
    // Helper class to store a passenger's initial check-in state
    private static class PassengerCheckIn {
        String stationName;
        int time;
        
        PassengerCheckIn(String stationName, int time) {
            this.stationName = stationName;
            this.time = time;
        }
    }
}


output
  Input
["UndergroundSystem","checkIn","checkIn","checkIn","checkOut","checkOut","checkOut","getAverageTime","getAverageTime","checkIn","getAverageTime","checkOut","getAverageTime"]
[[],[45,"Leyton",3],[32,"Paradise",8],[27,"Leyton",10],[45,"Waterloo",15],[27,"Waterloo",20],[32,"Cambridge",22],["Paradise","Cambridge"],["Leyton","Waterloo"],[10,"Leyton",24],["Leyton","Waterloo"],[10,"Waterloo",38],["Leyton","Waterloo"]]
Output
[null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]
Expected
[null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000]
