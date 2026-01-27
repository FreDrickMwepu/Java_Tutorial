import java.util.Scanner;

public class Example3 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int grade = sc.nextInt();
          String classification = switch(grade) {
               case 1, 2 -> "Distinction";
               case 3, 4 -> "Merit";
               case 5, 6 -> "Credit";
               case 7, 8 -> "Satisfactory";
               case 9 -> "Unsatisfactory";
               default -> "Grade is not valid";
          };
          System.out.print(classification);
     }
}