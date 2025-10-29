package Array.single_multi_Array.SwapRevRotArr_lect4;

import java.util.Scanner;

public class ReverseArray {
    
    static int[] reverseArray(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];
        int j=0;
        for(int i=n-1; i>=0; i--)
        {
            ans[j++] = arr[i];
        }
        return ans;
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
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" element");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        //int[] ans = reverseArray(arr);
        //printArray(ans);

        reverseArrayInPlace(arr);
    }
    
}
