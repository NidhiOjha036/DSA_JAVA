package Array.single_multi_Array.Pointers_lect5;

import java.util.Scanner;

public class SortArray {
    
    static void sortSquares(int[] arr)
    {
        int n = arr.length;
        int left=0, right=n-1;
        int[] ans = new int[n];
        //int k=0;
        int k=n-1;
        while (left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right]))
            {
                //ans[k++] = arr[left]*arr[left];
                ans[k--] = arr[left]*arr[left];
                left++;
            }else{
                ans[k--] = arr[right]*arr[right];
                right--;
            }
        }
        //reverseArrayInPlace(ans);
        printArray(ans);
    }

     static void sortArrayByParity(int[] arr)
     {
        int n = arr.length;
        int left=0, right = n-1;

        while (left < right) {
            if(arr[left]%2==1 && arr[right]%2==0)
            {
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2 == 0){
                left++;
            }
            if(arr[right]%2 == 1){
                right--;
            }
        }
        printArray(arr);

     }

     static void sortZeroesAndOnesPointers(int[] arr)
     {
        int n = arr.length;
        int left=0, right = n-1;

        while (left < right) {
            if(arr[left]==1 && arr[right]==0)
            {
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
        printArray(arr);

     }

    static void sortZeroesAndOnes(int[] arr)
    {
        int n = arr.length;
        int zeroes = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i] == 0)
            {
                zeroes++;
            }
        }
        // 0 to zeroes-1 : 0, zeroes to n-1 : 1
        for(int i=0; i<n; i++)
        {
            if(i<zeroes)
            {
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }
    static void reverseArrayInPlace(int[] arr)
    {
        int i=0; int j=arr.length-1;
        while (i<j) {
            swapInArray(arr,i,j);
            i++;
            j--;
        }
        printArray(arr);
    }


    static void swapInArray(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" element");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(arr);
        // sortZeroesAndOnes(arr);
        // System.out.println("Sorted Array");
        // printArray(arr);
         
        // System.out.println("Sorted Array Using Pointers");
        // sortZeroesAndOnesPointers(arr);

        // System.out.println("Sorted Array By Parity");
        // sortArrayByParity(arr);
       
        System.out.println("Sorted Squares");
        sortSquares(arr);

    }
    
}
