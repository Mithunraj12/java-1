import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter something
        System.out.println("Enter something:");

        // Read the input from the user
        String input = scanner.nextLine();

        // Print the input back to the console
        System.out.println("You entered: " + input);

        // Close the scanner
        scanner.close();
    }
}
