import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String op = sc.next();

        double result = 0;

        switch (op.toLowerCase()) {
            case "add":
                result = a + b;
                System.out.println("Addition = " + result);
                break;
            case "subtract":
                result = a - b;
                System.out.println("Subtraction = " + result);
                break;
            case "multiply":
                result = a * b;
                System.out.println("Multiplication = " + result);
                break;
            case "divide":
                if (b != 0) {
                    result = a / b;
                    System.out.println("Division = " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}

