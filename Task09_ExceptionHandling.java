import java.util.*;
public class Task09_ExceptionHandling
{
    static int div(int a, int b)
    {
        try
        {
            return a / b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("DIVISION BY 0 IS INVALID");
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = obj.nextInt();
        System.out.print("Enter the second number: ");
        int b = obj.nextInt();
        System.out.println("DIVISION VALUE : " + div(a, b));
        obj.close();
    }
}