import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber2 {
    public static void main(String[] args) {
        // Pick a random number
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1; // Generate a random number between 1 and 100

        System.out.print("Enter your guess: ");
        int guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("That's the correct number.");
        } else if (guess > number) {
            System.out.println("Try lower.");
        } else {
            System.out.println("Try higher.");
        }

        scanner.close();
    }
}
