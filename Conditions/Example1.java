import java.util.Scanner;

public class Example1 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter your marks: ");
          int marks = sc.nextInt();
          
          String result;
          if (marks < 0 || marks > 100) {
               result = "Invalid Marks";
          } else {
               switch (marks / 10) {
                    case 0, 1, 2, 3 -> result = "You got " + marks + "%, which is D. That is a Fail";
                    case 4 -> result = "You got " + marks + "%, which is D+. That is a Fail";
                    case 5 -> result = "You got " + marks + "%, which is C/C+. That is a Credit";
                    case 6 -> result = "You got " + marks + "%, which is B/B+. That is a Merit";
                    case 7, 8 -> result = "You got " + marks + "%, which is A. That is a Distinction";
                    case 9, 10 -> result = "You got " + marks + "%, which is A+. That is an Upper Distinction";
                    default -> result = "Invalid Marks";
               }
          }
          
          System.out.println(result);
          sc.close();
     }
}