import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange det första talet: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ange det andra talet: ");
        double num2 = scanner.nextDouble();

        System.out.println("Välj en operation: ");
        System.out.println("1. Addera");
        System.out.println("2. Subtrahera");
        System.out.println("3. Multiplicera");
        System.out.println("4. Dividera");

        int operation = scanner.nextInt();

        double result = 0;

        switch (operation) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Ogiltig operation.");
                return;
        }

        System.out.println("Resultatet är: " + result);

        scanner.close();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Kan inte dividera med noll.");
            return Double.NaN; // NaN representerar "Not a Number" vid ogiltig division
        }
    }
}