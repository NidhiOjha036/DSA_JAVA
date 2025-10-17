package Array.single_multi_Array.arr_lect2;

import java.util.Arrays;
import java.util.Scanner;

//Program to find smallest and largest element in the array using sort() to sort array.
//Program to find kth smallest and largest element in the array using sort() to sort array.
public class SmallestAndLargestEleInArray {

    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }

    static int[] kthSmallestAndLargestElement(int[] arr,int k){
        Arrays.sort(arr);
        int[] ans = {arr[k-1], arr[arr.length-k]};
        return ans;
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

        // int[] sortedArray = smallestAndLargestElement(arr);
        // System.out.println("Smallest: "+sortedArray[0]);
        // System.out.println("Largest: "+sortedArray[1]);

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        int[] sortedArray = kthSmallestAndLargestElement(arr,k);
        System.out.println(k+"th smallest: "+sortedArray[0]);
        System.out.println(k+"th largest: "+sortedArray[1]);



    }
}
