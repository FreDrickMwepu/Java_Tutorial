public class BreakLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Exit the loop when i is 6
            }
            System.out.println("Current number: " + i);
        }
        System.out.println("Loop has been exited.");
    }
}