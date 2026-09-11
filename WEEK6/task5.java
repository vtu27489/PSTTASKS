import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */
    public static String timeConversion(String s) {
        // Extract AM/PM modifier (last 2 characters)
        String ampm = s.substring(s.length() - 2);
        
        // Extract the hour as an integer
        int hour = Integer.parseInt(s.substring(0, 2));
        
        // Extract the minutes and seconds component (e.g., ":05:45")
        String timeWithoutHourAndAmPm = s.substring(2, s.length() - 2);
        
        String hourStr;
        if (ampm.equals("AM")) {
            if (hour == 12) {
                hourStr = "00"; // Midnight edge case
            } else {
                hourStr = String.format("%02d", hour); // Keep leading zero for 01-11
            }
        } else { // PM case
            if (hour == 12) {
                hourStr = "12"; // Noon edge case
            } else {
                hourStr = String.valueOf(hour + 12); // Convert afternoon hours
            }
        }
        
        // Combine the updated hour with the remainder of the time string
        return hourStr + timeWithoutHourAndAmPm;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


output
  Input (stdin)
07:05:45PM
Your Output (stdout)
19:05:45
Expected Output
19:05:45
