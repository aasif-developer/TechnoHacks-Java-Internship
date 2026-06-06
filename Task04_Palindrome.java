import java.util.Scanner;
public class Task04_Palindrome
{
    static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = obj.nextLine();
        String rev = reverse(str);
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + rev);

        if (str.equals(rev)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
        obj.close();
    }
}
