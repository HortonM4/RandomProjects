import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Ask the user if they want to play again
        System.out.println("Do you want to play again? (y/n)");
        char answer = scanner.next().charAt(0);

        // If the user says yes, play again
        if (answer == 'y') {
            main(args);
        }
    }
}