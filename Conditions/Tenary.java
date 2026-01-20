import java.util.Scanner;

public class Tenary {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter pH value (1-14): ");
          int ph = sc.nextInt();
          
          String result = (ph >= 1 && ph <= 6) ? "Acidic" :
                          (ph == 7) ? "Neutral" :
                          (ph >= 8 && ph <= 14) ? "Basic" :
                          "Invalid pH value";
          
          System.out.println(result);
          sc.close();
     }
}

