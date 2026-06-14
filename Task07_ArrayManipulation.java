// Bubble Sort for sorting the array
// Linear Search for searching an element

import java.util.*;
public class Task07_ArrayManipulation
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int[] arr = {40,20,70,90,50};
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("SORTED ARRAY ELEMENTS ARE :");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n\nENTER ELEMENT TO SEARCH : ");
        int key = obj.nextInt();
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                System.out.println("ELEMENT FOUND AT INDEX : " + i);
                return;
            }
        }
        System.out.println("ELEMENT NOT FOUND");
    }
}