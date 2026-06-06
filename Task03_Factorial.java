import java.util.Scanner;
public class Task03_Factorial
{
    static int factorial(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value to calculate factorial: ");
        int n = obj.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is : " + result);
        obj.close();
    }
}