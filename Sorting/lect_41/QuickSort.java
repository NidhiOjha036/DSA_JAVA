package Sorting.lect_41;

public class QuickSort {


    static void quickSort(int[] arr, int st, int end)
    {
        if(st>=end) return;

        int pi = partition(arr,st,end);
        
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);

    }

    static int partition(int[] arr, int st, int end)
    {
        int pivot = arr[st];
        int count = 0;
        for(int i = st+1; i<arr.length; i++)
        {
            if(arr[i] <= pivot) count++;
        }

        int pivotInd = st+count;

        swap(arr,st,pivotInd);

        int i = st, j=end;

        //element lesser or equal -> left side of pivotInd, greater -> right side of pivotInd
        while( i<pivotInd && j>pivotInd )
        {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if(i<pivotInd && j>pivotInd)
            {
                swap(arr,i,j);
                i++;
                j--;
            }
        }

        return pivotInd;
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        int[] arr = {4,1,3,5,2,-5};
        int n = arr.length;
        System.out.println("Array before sorting");
        displayArr(arr);
        
        quickSort(arr, 0, n-1);
        System.out.println("Array after sorting");
        displayArr(arr);
        
    }
    
}
