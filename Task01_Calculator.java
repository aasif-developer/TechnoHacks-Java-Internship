
import java.util.Scanner;

public class Task01_Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("SIMPLE CALCULATOR");
        while (true) {
            System.out.print("Enter First Number: ");
            int a = obj.nextInt();
            System.out.print("Enter Second Number: ");
            int b = obj.nextInt();

            System.out.println("\nChoose Operation");
            System.out.println("+ : Addition");
            System.out.println("- : Subtraction");
            System.out.println("* : Multiplication");
            System.out.println("/ : Division");
            System.out.println("% : Modulus");

            System.out.print("Enter Operator: ");
            char op = obj.next().charAt(0);

            if (op == '+') {
                System.out.println("Result = " + add(a, b));
            } else if (op == '-') {
                System.out.println("Result = " + subtract(a, b));
            } else if (op == '*') {
                System.out.println("Result = " + multiply(a, b));
            } else if (op == '/') {
                if (b == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    System.out.println("Result = " + divide(a, b));
                }
            } else if (op == '%') {
                if (b == 0) {
                    System.out.println("Modulus by zero is not allowed.");
                } else {
                    System.out.println("Result = " + modulus(a, b));
                }
            } else {
                System.out.println("Invalid Operator!");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            char choice = obj.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                System.out.println("Thank You for Using the Calculator!");
                break;
            }

            System.out.println();
        }
        obj.close();
    }
}
