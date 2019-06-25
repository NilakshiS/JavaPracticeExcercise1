import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        String userInput;
        int sum = 0;
        boolean flag = false;
        Scanner inputObject = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        userInput = inputObject.nextLine();

        String[] numbers = userInput.split("\\s+");



        for (int i=0;i<numbers.length;i++) {
            for (int j=0;j<numbers[i].length();j++) {
                if (!Character.isDigit(numbers[i].charAt(j))) {
                    System.out.println("Error! non integer values!");
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            else{
                sum+=Integer.parseInt(numbers[i]);
            }
        }

        if (!flag) {
            System.out.println(sum);
        }

    }
}
