//implementation of Exception handling try catch finally eg

import java.util.*;

public class demo {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Array out of bound excetion example");
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("4th Element of the array :" + arr[3]);
        System.out.println("5ht Element of the array :" + arr[2]);
        System.out.println("ENTER THE INDEX TO SEARCH :");
        int a = obj.nextInt();
        try {
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.println("The element on the index " + a + " is " + arr[a]);
                break;
            }
        } catch (Exception e) {
            System.out.println("ENTER VALID INDEX VALUE");

        }
        finally
        {
            System.out.println("PROGRAM FINISHED");
        }
    }
}
