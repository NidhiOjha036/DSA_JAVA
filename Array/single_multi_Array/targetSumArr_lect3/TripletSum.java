package Array.single_multi_Array.targetSumArr_lect3;

import java.util.Scanner;

public class TripletSum {

    static int tripletSum(int[] arr, int target)
    {
        int n = arr.length;
        int tripletCount = 0;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++){

                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == target)
                    {
                        tripletCount++;
                    }
                }
            }
        }
        return tripletCount;
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

        int ans = tripletSum(arr, target);
        System.out.println("Total numbers of triplets = "+ans);
    }
    
}
