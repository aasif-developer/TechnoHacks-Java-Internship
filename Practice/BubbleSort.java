public class BubbleSort
{
    public static void main(String[] args)
    {
      int[] arr = {40,20,700,90,50};
      System.out.println("THE ARRAY ELEMENTS ARE : ");
      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr.length -1 ;j++)
        {
            if(arr[j] > arr[j+1])
            {
                int temp=arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
            }
        }   
      }
      System.out.println("THE SORTER ARRAY ELEMENTS ARE  : ");
      for(int i=0 ; i<arr.length ;i++)
      {
        
        System.out.print(arr[i]+" ");
      }
    }
}