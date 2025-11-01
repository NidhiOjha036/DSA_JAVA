package Array.single_multi_Array.PrefixSum_lect6;

import java.util.Scanner;

//For a given array of integers of size n, 
// answer q queries to print the sum of values in a given range of indices from l to r
public class RangeQuery {

     static int[] makePrefixSumArray(int[] arr)
    {
        int n = arr.length;
        for(int i=1; i<n; i++)
        {
            arr[i] += arr[i-1];
        }
        return arr;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter "+n+" element");
        for(int i=1; i<=n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] prefixSum = makePrefixSumArray(arr);

        System.out.print("Enter number of queries ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefixSum[r] - prefixSum[l-1];
            System.out.println("Sum "+ans);
        }

    }

}
