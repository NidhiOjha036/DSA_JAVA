package Array.single_multi_Array.SwapRevRotArr_lect4;

import java.util.Scanner;

public class RotateArray {

    static int[] rotateArray(int[] arr, int k)
    {

        int n = arr.length;
        k = k%n;
        int[] ans = new int[n];
        int j=0;
        for(int i=n-k; i<n; i++)
        {
            ans[j++] = arr[i];
        }
        for(int i=0; i<n-k; i++)
        {
            ans[j++] = arr[i];
        }
        return ans;

    }

    static void rotateInPlace(int[] arr,int k)
    {
        int n = arr.length;
        k = k%n;
        reverseArrayInPlace(arr,0, n-k-1);
        reverseArrayInPlace(arr,n-k, n-1);
        reverseArrayInPlace(arr,0, n-1);

    }

    static void reverseArrayInPlace(int[] arr,int i, int j)
    {
        while (i<j) {
            swapInArray(arr,i,j);
            i++;
            j--;
        }
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

        System.out.println("Enter K: ");
        int k = sc.nextInt();

        System.out.println("Original array");
        printArray(arr);

        //int[] ans = rotateArray(arr, k);
        rotateInPlace(arr, k);
        System.out.println("Array after rotation");
       // printArray(ans);
       printArray(arr);

    }
    
}
