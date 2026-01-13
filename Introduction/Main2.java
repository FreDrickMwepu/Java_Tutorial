import java.util.Scanner;

public class Main2 {
     static int x = 56; 
     public static void main(String[] args) {
          // This is a single line comment 

          /* 
               This is a multiple line comment
          */
          System.out.print("\nHello World");
          System.out.println("\nHello World");
          
          
          // Usage of variables in java
          // int, float, double, String, char, boolean
          short y = 15; 
          long z = 100;
          double w = 5.4;
          float f = 3;
          boolean b = false;
          boolean a =true;
          char c = 'A';
          String s = "Welcome to my house party";
          System.out.print(w);
          int x;
          System.out.print(x);

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a value: ");
          int x = sc.nextint();
          double d = sc.nextdoublint();
          System.out.println("you entered "+x);
          sc.close();


     }
}