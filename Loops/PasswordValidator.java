import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "secret123";
        String userInput = "";
        int attempts = 0;
        int maxAttempts = 3;

        while (!userInput.equals(correctPassword) && attempts < maxAttempts) {
            System.out.print("Enter password: ");
            userInput = scanner.nextLine();
            attempts++;

            if (!userInput.equals(correctPassword)) {
                System.out.println("Incorrect. Attempts remaining: " + (maxAttempts - attempts));
            }
        }

        if (userInput.equals(correctPassword)) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Account locked. Too many failed attempts.");
        }

        scanner.close();
    }
}