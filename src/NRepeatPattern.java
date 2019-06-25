import java.util.Scanner;

public class NRepeatPattern {
    public static void main(String[] args) {
        String stringInput;
        int numberInput;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter the string: ");
        stringInput = inputObject.nextLine();
        System.out.println("Enter the number n: ");
        numberInput = inputObject.nextInt();

        System.out.print(stringInput);

        for (int i = 0; i < numberInput; i++) {
            System.out.print(stringInput.substring(stringInput.length()-numberInput));
        }
    }
}
