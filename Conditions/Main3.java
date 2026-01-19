public class Main3 {
     public static void main(String[] args) {
          int a = 200;
          int b = 33;
          int c = 500;

          if (a > b && a > c) {
               System.out.println("a is the largest number");
          } else if (b > a && b > c) {
               System.out.println("b is the largest number");
          } else {
               System.out.println("c is the largest number");
          }
     }
}