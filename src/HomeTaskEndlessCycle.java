import java.util.Scanner;

public class HomeTaskEndlessCycle {
    public static void main(String[] args) {
        System.out.println("Enter number!");
        Scanner cycle = new Scanner(System.in);
        int number = cycle.nextInt();
        int secret = 33;

        while (true) {
            if (number > 33) {
                System.out.println("Less!");
            }
            if (number < 33) {
                System.out.println("More!");
            }
            if (number == 33) {
                System.out.println("Break!");
                break;
            }
            number = cycle.nextInt();


        }
    }
}
