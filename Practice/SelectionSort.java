public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {40,20,30,10};

        for(int i = 0; i < arr.length - 1; i++)
        {
            int min = i;

            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("SORTED ARRAY : ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}