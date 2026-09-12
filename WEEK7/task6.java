import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();

        for (int grade : grades) {
            // Rule 1: No rounding if the grade is less than 38
            if (grade < 38) {
                roundedGrades.add(grade);
            } else {
                // Find the next multiple of 5
                int nextMultipleOfFive = ((grade / 5) + 1) * 5;
                
                // Rule 2: Round up if the difference is less than 3
                if (nextMultipleOfFive - grade < 3) {
                    roundedGrades.add(nextMultipleOfFive);
                } else {
                    roundedGrades.add(grade);
                }
            }
        }
        
        return roundedGrades;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of students
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            List<Integer> grades = new ArrayList<>();
            
            // Read individual grades
            for (int i = 0; i < n; i++) {
                grades.add(scanner.nextInt());
            }
            
            // Get rounded results
            List<Integer> result = gradingStudents(grades);
            
            // Print the output
            for (int grade : result) {
                System.out.println(grade);
            }
        }
        
        scanner.close();
    }
}


output
  Input (stdin)
4
73
67
38
33
Expected Output
75
67
40
33
