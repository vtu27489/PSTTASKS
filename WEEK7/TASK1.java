class ParkingSystem {
    // Array to store the capacity/remaining slots for big (1), medium (2), and small (3) cars.
    // Index 0 is padding, index 1 = big, index 2 = medium, index 3 = small.
    private int[] count;

    public ParkingSystem(int big, int medium, int small) {
        count = new int[]{0, big, medium, small};
    }
    
    public boolean addCar(int carType) {
        // If slots are available for the specific carType, decrement and return true
        if (count[carType] > 0) {
            count[carType]--;
            return true;
        }
        // No slots available
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */


output:
Input
["ParkingSystem","addCar","addCar","addCar","addCar"]
[[1,1,0],[1],[2],[3],[1]]
Output
[null,true,true,false,false]
Expected
[null,true,true,false,false]
