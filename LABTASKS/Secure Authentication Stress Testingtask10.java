
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUser = "admin";
        String correctPass = "1234";

        int attempts = sc.nextInt();
        int failed = 0;

        for (int i = 0; i < attempts; i++) {
            String user = sc.next();
            String pass = sc.next();

            if (user.equals(correctUser) &&
                pass.equals(correctPass)) {
                System.out.println("Login Successful");
            } else {
                failed++;
                System.out.println("Login Failed");
            }
        }

        System.out.println("Failed Attempts: " + failed);
    }
}


input
3
admin 1111
user 1234
admin 1234
  output
  Login Failed
Login Failed
Login Successful
Failed Attempts: 2
