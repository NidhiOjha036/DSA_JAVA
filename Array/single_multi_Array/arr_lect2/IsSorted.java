package Array.single_multi_Array.arr_lect2;

import java.util.Scanner;

//Program to check if an array is sorted or not
public class IsSorted {

    static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i-1] > arr[i])
            {
                //not sorted
                check = false;
                break;
            }
        }
        return check;
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

        System.out.println("Is Sorted: "+isSorted(arr));
    }
}
