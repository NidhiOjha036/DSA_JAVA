package Array.single_multi_Array.PrefixSum_lect6;

import java.util.Scanner;

public class SuffixSumArray {

    static int[] makeSufixSumArray(int[] arr)
    {
        int n = arr.length;

        for(int i=n-2; i>=0; i--)
        {
            arr[i] += arr[i+1];
        }
        return arr;
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
        System.out.println("Prefix Sum Array");
        int[] suffixSumArrayArray = makeSufixSumArray(arr);
        printArray(suffixSumArrayArray);
    }
    
}
