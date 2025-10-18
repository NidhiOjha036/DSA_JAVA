package Array.single_multi_Array.targetSumArr_lect3;

import java.util.Scanner;

public class SecondLargest {

    static int findMax(int[] arr)
    {
        int mx = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            if(arr[i] > mx)
            {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findSecondMax(int[] arr)
    {
        int mx = findMax(arr);
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == mx)
            {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);
        return secondMax;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        int secondMax = findSecondMax(arr);
        System.out.println("Second Largest Element: "+secondMax);

    }
}
