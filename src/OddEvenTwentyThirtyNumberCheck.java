import java.util.Scanner;

public class OddEvenTwentyThirtyNumberCheck {
    public static void main(String[] args) {
        int inputNumber;
        Scanner inputObject = new Scanner(System.in);

        System.out.println("Enter the number to be checked");

        inputNumber = inputObject.nextInt();

        if (inputNumber>20 && inputNumber<30) {
            System.out.println((inputNumber%2==0)?"Jerry":"Tom");
        }
    }
}
