package Array.single_multi_Array.targetSumArr_lect3;

import java.util.Scanner;

public class SecondSmallest {

    static int findMin(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    static int findSecondMin(int[] arr)
    {
        int min = findMin(arr);
        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == min)
            {
                arr[i] = Integer.MAX_VALUE;
            }
        }

        int secondMin = findMin(arr);
        return secondMin;

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

        
        int secondMin = findSecondMin(arr);
        System.out.println("Second Smallest Element: "+secondMin);

        

    }
    
}
