import java.util.Scanner;

public class Switch {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter pH value (1-14): ");
          int ph = sc.nextInt();
          switch(ph) {
               case 1: 
               case 2: 
               case 3: 
               case 4: 
               case 5: 
               case 6: 
                    System.out.println("Acidic");
                    break;
               case 7: 
                    System.out.println("Neutral");
                    break;
               case 8: 
               case 9: 
               case 10: 
               case 11: 
               case 12: 
               case 13: 
               case 14: 
                    System.out.println("Basic");
                    break;
               default: 
                    System.out.println("Invalid pH value");
          }
          sc.close();
     }
}