import java.util.Scanner;

public class populateArray {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String [] names = new String[10];


          for (int i = 0; i<=names.length; i++) {
               System.out.print("Enter Name " + (i+1) + ": ");
               names[i] = sc.nextLine();
          }

          System.out.println("\nNames in the array are: ");
          for (int i = 0; i<names.length; i++) {
               System.out.println(names[i]);
          }
     }
}