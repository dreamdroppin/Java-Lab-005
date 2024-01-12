import java.util.Scanner;
public class Fermat {
    public static void main(String[] args) {
        // Prompt the user to enter the values of a, b, c, and n
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();
        System.out.print("C: ");
        int c = scanner.nextInt();
        System.out.print("N: ");
        int n = scanner.nextInt();

        //Validate
        if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn’t work.");
        }

        scanner.close();
    }
}
