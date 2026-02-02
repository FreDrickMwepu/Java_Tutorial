public class Main2 {
     public static void main(String[] args) {
          /*
           You can also create an array by specifying the size of the array with 
           new keyword. This makes an empty array with space for the fixed number of elements, 
           which you can fill later
          */
          String[] cars = new String[4];

          cars[0] = "Volvo";
          cars[1] = "BMW";
          cars[2] = "Ford";
          cars[3] = "Mazda";

          System.out.println(cars[0]);
          System.out.println(cars[1]);
          System.out.println(cars[2]);
          System.out.println(cars[3]);

          /*
          However, if you already know the values, ypu don't need to write new. 
          Both of these create the same array:
          */
         // With new keyword:
         String[] fruits = new String[] {"Apple", "Banana", "Cherry"};
         // Shortcut (most common way):
         String[] veggies = {"Carrot", "Broccoli", "Spinach"};
     }
}