import java.util.Scanner;

public class populateArray {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String [] names;
          names = new String[10];

          System.out.print("Enter Names: ");
          int position = sc.nextInt();
          names[0] = "Fredrick";

          for (int i = 0; i<=names.length; i++) {
               System.out.print("Enter Name " + i);
          }



     }
}