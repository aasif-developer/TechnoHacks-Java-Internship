import java.util.Scanner;
public class Task02_Fibonacci
{
    static void fibonacci(int n)
    {
        int a = 0;
        int b = 1;
        int c;
        while(a <= n)
        {
            System.out.print(a+"  ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Limit value: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        fibonacci(n);
        sc.close();
    }
}