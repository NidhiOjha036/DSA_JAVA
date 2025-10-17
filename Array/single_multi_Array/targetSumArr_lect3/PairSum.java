package Array.single_multi_Array.targetSumArr_lect3;

import java.util.Scanner;

public class PairSum {

    static int pairSum(int[] arr, int target)
    {
        int n = arr.length;
        int pairCount = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target)
                {
                    pairCount++;
                }
            }
        }
        return pairCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        int ans = pairSum(arr, target);
        System.out.println("Total numbers of pairs = "+ans);


    }
}
