/*
A for-each loop is used to iterate through elements in an array or a collection.
It is a simpler way to loop through arrays and collections when you do not need to
*/

public class ForEachLoop {
     public static void main(String[] args) {
          String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
          /*
               The colon (:) is read as "in"
               So, for each car in cars do the following
          */
          for (String car : cars) {
               System.out.println(car);
          }
     }
}