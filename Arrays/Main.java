import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
          String [] names;
          names = new String[10];
          names[0] = "Fredrick";
          names[1] = "Andrew";
          names[2] = "Moddy";
          names[3] = "Fredrick";
          names[4] = "Esther";
          names[5] = "Hellen";
          names[6] = "Fredrick";
          names[7] = "Evaristo";
          names[8] = "Cyrus";
          names[9] = "Victoria";

          for (int count3 = 0; count3 <= 9; count3++) {
               System.out.println("- " + names[count3]);
          }

          System.out.println(" ");

          int x[] = new int[]{22, 15, 17, 5, 18};

          System.out.println("While Loop");
          int count = 0;
          while (count <= 4) {
               System.out.print(x[count] + " ");
               count++;
          }

          System.out.println(" ");

          System.out.println("For Loop");
          for (int count1 = 0; count1 <= 4; count1++) {
               System.out.print(x[count1] + " ");
          }

          System.out.println(" ");

          System.out.println("Do-While Loop");
          int count2 = 0;
          do {
               System.out.print(x[count2] + " ");
               count2++;
          } while(count2 <= 4);

     }
}