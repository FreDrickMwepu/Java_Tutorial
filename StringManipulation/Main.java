public class Main {
     public static void main(String[] args) {
          String name  = " John Doe";

          // Uppercase and Lower
          System.out.println("Uppercase:"+ name.toUpperCase());
          System.out.println("Lowercase:"+ name.toLowerCase());
          // Length - returns 
          System.out.println(name.length());
          // Contains - returns Boolean
          System.out.println(name.contains("H"));
          // Index of - 
          System.out.println(name.indexOf("h"));
          // CharArt - integer
          System.out.println(name.charAt(0));

          int age = 20;
          String ageString = String.valueOf(age);
          System.out.println("Age as String: " + ageString);
     }
}