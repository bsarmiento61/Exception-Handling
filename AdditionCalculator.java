import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        } finally {
            scanner.close();
        }
    }
}