package Sorting.lect_44;

public class CounterSort {

    static int findMax(int[] arr)
    {
        int mx = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>mx)
            {
                mx = arr[i];
            }
        }

        return mx;
        
    }

    static void basicCounterSort(int[] arr)
    {
        int max = findMax(arr); //find the largest element of the arr
        int[] count = new int[max+1];
        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }
        //frequency array
        int k=0;
        for(int i=0; i<count.length; i++)
        {
            for(int j=0; j<count[i]; j++)
            {
                arr[k++] = i;
            }
        }

    }

    static void countSort(int[] arr)
    {
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr); //find the largest element of the arr
        int[] count = new int[max+1];
        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }
        //frequency array
        int k=0;
        for(int i=0; i<count.length; i++)
        {
            for(int j=0; j<count[i]; j++)
            {
                arr[k++] = i;
            }
        }

        //prefixSum Array
        for(int i=1; i<count.length; i++)
        {
            count[i] += count[i-1];
        }

        //find the index of each element in the original array and put it in the output array
        for(int i=n-1; i>=0; i--)
        {
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        //copy output array in original array
        for(int i=0; i<n; i++)
        {
            arr[i] = output[i];
        }
    }

    static void displayArr(int[] arr)
    {
        for(int val: arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,2,2,5};
        //basicCounterSort(arr);
        countSort(arr);
        displayArr(arr);
    }
}
