import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int userInput;
        Random random = new Random();

        int targetNumber = random.nextInt(10)+1;

        do {
            Scanner inputObject = new Scanner(System.in);
            System.out.println("Enter a number (between 1 to 10): ");
            userInput = inputObject.nextInt();

            if (userInput == targetNumber) {
                System.out.println("Number guessed matches the original number");
            }
            else if (userInput > targetNumber) {
                System.out.println("Number guessed is greater than the original number");
            }
            else {
                System.out.println("Number guessed is less than the original number");
            }
        } while (userInput!=targetNumber);
    }
}
