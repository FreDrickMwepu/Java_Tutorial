import java.util.Scanner;

public class Example {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter your marks: ");
          int marks = sc.nextInt();

          String result = (marks <= 39) ? "You got " + marks +"% "+ ", which is D" + " .That is a Fail" :
                         (marks >= 40 && marks <= 49 ) ? "You got " + marks +"%"+ ", which is D+" + ". That is a Fail" :
                         (marks >= 50 && marks <= 55 ) ? "You got " + marks +"%"+ ", which is C" + ". That is a Credit" :
                         (marks >= 56 && marks <= 61 ) ? "You got " + marks +"%"+ ", which is C+" + ". That is an Upper  Credit" :
                         (marks >= 62 && marks <= 67 ) ? "You got " + marks +"%"+ ", which is B" + ". That is Merite " :
                         (marks >= 68 && marks <= 75 ) ? "You got " + marks +"%"+ ", which is B+" + ". That is a Merite" :
                         (marks >= 76 && marks <= 85 ) ? "You got " + marks +"%"+ ", which is A" + ". That is a Distiction" :
                         (marks >= 86 && marks <= 100 ) ? "You got " + marks +"%"+ ", which is A+" + ". That is an Upper Distiction" :
                         "Invalid Marks";
          
          System.out.println(result);
          sc.close();


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