import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String inputNumber;
        Scanner inputObject = new Scanner(System.in);

        System.out.println("Enter the number to be checked");

        inputNumber = inputObject.nextLine();
        boolean flag = true;
        for (int i = inputNumber.length()-1;i>=inputNumber.length()/2;i--){
            if (inputNumber.charAt((inputNumber.length()-1)-i)!=inputNumber.charAt(i)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("The number is palindrome");
            int sum = 0;
            for (int i = 0;i<inputNumber.length();i++){
                int num = inputNumber.charAt(i)-48;
                sum += (num%2==0?num:0);
            }
            if (sum > 25) {
                System.out.println("and sum of even numbers is greater than 25");
            }
            else {
                System.out.println("and sum of even numbers is less than 25");
            }
        }
        else {
            System.out.println("The number is not palindrome");
        }

    }
}
