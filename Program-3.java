// User-defined exception class for DivideByZeroError
class DivideByZeroError extends Exception {
    public DivideByZeroError(String message) {
        super(message);
    }
}

// Class with a method to perform division operation
class Divider {
    // Method to perform division operation
    public static double divide(int numerator, int denominator) throws DivideByZeroError {
        if (denominator == 0) {
            throw new DivideByZeroError("Error: Division by zero");
        }
        return (double) numerator / denominator;
    }
}

// Main class to test the custom exception
public class Program-3 {
    public static void main(String[] args) {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");
        int numerator = 10;
        int denominator = 0;

        try {
            double result = Divider.divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (DivideByZeroError e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
