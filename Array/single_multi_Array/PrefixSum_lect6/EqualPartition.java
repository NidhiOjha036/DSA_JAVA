package Array.single_multi_Array.PrefixSum_lect6;

import java.util.Scanner;

//Program to check if an array can be partitioned into sub-arrays with equal sum
public class EqualPartition {

    static int findArraySum(int[] arr)
    {

        int totalSum=0;
        for(int i=0; i<arr.length; i++)
        {
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr)
    {
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for(int i=0; i<arr.length; i++)
        {
            prefSum += arr[i];
            int suffixSum = totalSum-prefSum;
            if(prefSum==suffixSum)
            {
                return true;
            }
        }
        return false;
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
        boolean partitionCheck = equalSumPartition(arr);
        System.out.println("Equal Partition Possible: "+partitionCheck);
    }
}
