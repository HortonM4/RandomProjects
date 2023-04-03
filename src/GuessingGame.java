import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        Scanner input = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 10. Can you guess what it is?");

        do {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess < randomNumber) {
                System.out.println("Your guess is too low. Try again!");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        } while (guess != randomNumber);
    }
}
