public class Main {
     public static void main(String[] args) {
          // Hello world
          System.out.println("Hello World");

          // Variables & data types
          int i = 10;
          double d = 3.14;
          boolean b = true;
          char c = 'A';
          String s = "Java";

          // Operators
          int sum = i + 5;
          int prod = i * 2;
          boolean cond = (i > 5) && b;

          System.out.println("i=" + i + " d=" + d + " sum=" + sum + " prod=" + prod + " cond=" + cond);

          // Conditional statements
          if (i % 2 == 0) {
               System.out.println(i + " is even");
          } else {
               System.out.println(i + " is odd");
          }

          // Switch (Java 7+)
          switch (s) {
               case "Java":
                    System.out.println("Language is Java");
                    break;
               default:
                    System.out.println("Other language");
          }

          // Loops
          for (int k = 0; k < 3; k++) {
               System.out.println("for loop k=" + k);
          }

          int k = 0;
          while (k < 3) {
               System.out.println("while loop k=" + k);
               k++;
          }

          // Arrays
          int[] arr = { 1, 2, 3, 4 };
          for (int val : arr) {
               System.out.println("array value: " + val);
          }

          // Strings
          String hello = "Hello";
          String world = "World";
          String combined = hello + " " + world;
          System.out.println(combined + " length=" + combined.length());

          // Basic input/output using Scanner
          java.util.Scanner scanner = new java.util.Scanner(System.in);
          System.out.print("Enter a number: ");
          if (scanner.hasNextInt()) {
               int user = scanner.nextInt();
               System.out.println("You entered: " + user);
          } else {
               System.out.println("Not an integer");
          }
          scanner.close();
     }
}