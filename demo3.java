import java.util.*;
public class demo3
{
    static void checkAge(int age)
    {
        if(age < 0)
        {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        System.out.println("Age Accepted");
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        try
        {
            System.out.print("Enter Age: ");
            int age = obj.nextInt();

            checkAge(age);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        obj.close();
    }
}