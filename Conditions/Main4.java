public class Main4 {
     public static void main(String[] args) {
          boolean isLoggedIn = true;
          boolean isAdmin = false;
          int securityLevel = 2; // 1 = heighst

          if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
               System.out.println("Access granted");
          } else {
               System.out.println("Access denied");
          }
     }
}