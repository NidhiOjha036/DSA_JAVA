package Recursion.lect_37;

public class SelectionSort {

    static void selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            int min_ind = i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[min_ind])
                {
                    min_ind = j;
                }
            }

            if(min_ind != i)
            {
                int temp = arr[i];
                arr[i] = arr[min_ind];
                arr[min_ind] = temp;
            }
            

        }
    }

    public static void main(String[] args) {

        int[] arr = {7,4,5,1,2,20};
        selectionSort(arr);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
        
    }
}
