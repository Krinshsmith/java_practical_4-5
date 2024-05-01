import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class List4_10 {
    public static void main(String[] args) {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            // Read the file content or perform any other operations here
            System.out.println("File successfully opened!");

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
