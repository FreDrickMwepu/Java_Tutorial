// Import statement - brings in external classes we need to use
// Scanner is a class from java.util package that reads user input
import java.util.Scanner;

// Class declaration - the blueprint for our program
// "public" means this class can be accessed from other packages
// "class" is the keyword to define a class
// "Input" is the name of our class (must match the filename)
public class Input {

    // Main method - the entry point of any Java program
    // "public" - accessible from anywhere
    // "static" - belongs to the class itself, not an instance
    // "void" - this method doesn't return any value
    // "String[] args" - array of command-line arguments passed to the program
    public static void main(String[] args) {

        // Creating a Scanner object to read input from the console
        // "Scanner" is the class type
        // "scanner" is the variable name (reference to the object)
        // "new Scanner()" creates a new instance of Scanner
        // "System.in" represents the standard input stream (keyboard)
        Scanner scanner = new Scanner(System.in);

        // Output statement - prints text to the console
        // "System.out" is the standard output stream
        // "print()" prints without a newline at the end
        System.out.print("Enter your name: ");

        // Reading a String input from the user
        // "nextLine()" reads the entire line of text until Enter is pressed
        String name = scanner.nextLine();

        // "println()" prints with a newline at the end
        System.out.println("Hello, " + name + "!");

        // Reading an integer from the user
        System.out.print("Enter your age: ");
        // "nextInt()" reads the next integer value
        int age = scanner.nextInt();

        // Reading a decimal number from the user
        System.out.print("Enter your height (in meters): ");
        // "nextDouble()" reads the next decimal (floating-point) number
        double height = scanner.nextDouble();

        // String concatenation using the + operator
        // Combines text and variables into a single output
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " meters");

        // Closing the scanner to free up system resources
        // Always close resources when you're done using them
        scanner.close();
    }
}
