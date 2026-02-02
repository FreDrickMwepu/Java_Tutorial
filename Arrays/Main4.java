/*
To demonstrate a practical example of using arrays, let's create a program that calculates the average age
of different ages in an array.
*/

public class Main4 {
     public static void main(String[] args) {
          // An array storing different ages
          int ages[] = {12, 4, 5, 22, 45, 67, 34, 89, 90};

          float avg, sum = 0;

          // Get the length of the array
          int length = ages.length;

          // Loop through the array to calculate the sum of ages
          for (int i = 0; i < length; i++) {
               sum += ages[i];
          }

          // Calculate the average
          avg = sum / length;
          System.out.println("The average age is: " + avg);
     }
}