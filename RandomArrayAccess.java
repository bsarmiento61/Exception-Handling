import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomArrayAccess {
    public static void main(String[] args) {
        double[] numbers = new double[50];
        Random random = new Random();

        // Fill the array with random double values between 0 and 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble() * 100;
            System.out.println(numbers[i]);
        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an index (0–49): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range. Please enter a number between 0 and 49.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter an integer value for the index.");
        } finally {
            scanner.close();
        }
    }
}
