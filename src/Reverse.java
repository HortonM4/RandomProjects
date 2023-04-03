import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Print the number in reverse order
        System.out.println("The reverse of the number is " + reverse(number));
    }

    public static String reverse(int number) {
        String strNumber = String.valueOf(number);
        String reverseNumber = "";

        // Iterate through the string from the end
        for (int i = strNumber.length() - 1; i >= 0; i--) {
            reverseNumber += strNumber.charAt(i);
        }

        // Return the reversed number
        return reverseNumber;
    }
}