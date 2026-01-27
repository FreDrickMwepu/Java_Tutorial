public class Main1 {
     public static void main(String[] args) {


          int x[] = new int[]{10, 9, 8, 7, 6, 5};
          int y[] = new int[]{10, 8, 6, 4, 2, 0};
          int z[] = new int[]{1, 3, 5, 7, 9};

          System.out.println("While Loop");
          int count = 0;
          while (count <= 5) {
               System.out.print(x[count] + " ");
               count++;
          }

          System.out.println(" ");

          System.out.println("For Loop");
          for (int count1 = 0; count1 <= 5; count1++) {
               System.out.print(y[count1] + " ");
          }

          System.out.println(" ");

          System.out.println("Do-While Loop");
          int count2 = 0;
          do {
               System.out.print(y[count2] + " ");
               count2++;
          } while(count2 <= 4);

     }
}