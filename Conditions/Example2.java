import java.util.Scanner;

public class Example2 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter your marks: ");
          int marks = sc.nextInt();

          if (marks <= 39) {
               System.out.print("You got " + marks + "%" ", which is an D" + ". That is Unsatisfactory");
          } if else (marks >= 40 && marks <= 49) {
               System.out.print("You got " + marks + "%" ", which is an D+" + ". That is Satisfactory");
          }if else (marks >= 50 && marks <= 55) {
               System.out.print("You got " + marks + "%" ", which is an C" + ". That is a Credit");
          } if else (marks >= 56 && marks <= 61) {
               System.out.print("You got " + marks + "%" ", which is an C+" + ". That is an Upper Credit");
          } if else (marks >= 62 && marks <= 67) {
               System.out.print("You got " + marks + "%" ", which is an B" + ". That is a Merit");
          } if else (marks >= 68 && marks <= 75) {
               System.out.print("You got " + marks + "%" ", which is an B+" + ". That is an Upper Merit");
          } if else (marks >= 76 && marks <= 85) {
               System.out.print("You got " + marks + "%" ", which is an A" + ". That is a Distinction");
          } if else (marks >= 86 && marks <= 100) {
               System.out.print("You got " + marks + "%" ", which is an A+" + ". That is an Upper Distinction");
          } 

     }
}

/* 
Specification:
     - User enters the marks
     - Use if statements to determine the grade (0 - 39D, 40 - 49 D+, 50 - 55C, 56 - 61C+, 62 - 67B, 68 - 75B+, 76 - 85A, 86 - 100A+) based on the marks
     - Use switch statement to provide remarks based on the grade
     - print the grade and remarks
Output:
     You got 80%, which is an A. That is a Distiction
*/