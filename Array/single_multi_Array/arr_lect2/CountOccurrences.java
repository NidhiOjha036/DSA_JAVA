package Array.single_multi_Array.arr_lect2;

import java.util.Scanner;

public class CountOccurrences {

    //Program to count the number of occurrences of element x in a given array
    static int countOccurrences(int[] arr, int x)
     {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == x){
                count++;
            }
        }
        return count;
     }

     //Program to find the last occurrence of element x in a given array
     static int lastOccurrence(int[] arr, int x)
     {
        int lastIndex = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
     }

     //Program to count the number of elements strictly greater than a value x
     static int checkGreaterOccurrence(int[] arr, int x)
     {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > x){
                count++;
            }
        }
        return count;
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

        System.out.println("Enter x");
        int x = sc.nextInt();

       // System.out.println("Count of X: "+countOccurrences(arr, x));
       // System.out.println("Last Occurence of "+x+" : "+lastOccurrence(arr, x));
       System.out.println("Greater Occurence of "+x+" : "+checkGreaterOccurrence(arr, x));

    }
}
