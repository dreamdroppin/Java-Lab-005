import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        // Prompt for input
        Scanner in = new Scanner(System.in);
        int a = validate(in, "Sticks One: ");
        int b = validate(in, "Sticks Two: ");
        int c = validate(in, "Sticks Three: ");

        //Check format
        if (vaild(a, b, c)) {
            System.out.println("This can form a triangle.");
        } else {
            System.out.println("Enter a positive number, please.");
        }

        in.close();
    }
    //Checking
    private static int validate(Scanner scanner, String promptMessage) {
        int input;
        while (true) {
            System.out.print(promptMessage);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input > 0) {
                    break;
                } else {
                    System.err.println("Error: Length must be a positive number.");
                }
            } else {
                System.err.println("Error: Invalid input. Please enter a positive number.");
                scanner.next();
            }
        }
        return input;
    }
    //Checking
    private static boolean vaild(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}