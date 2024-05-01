import java.util.Scanner;

public class Program-9 {
    public static void main(String[] args) {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (or a non-numeric value to quit): ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);
                System.out.println("You entered: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Error: The input is not a valid integer.");
                break;
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
