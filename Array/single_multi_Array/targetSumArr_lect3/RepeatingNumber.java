package Array.single_multi_Array.targetSumArr_lect3;

import java.util.Scanner;

public class RepeatingNumber {

    static int firstRepeatingNumber(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n; i++) //first Number
        {
            for(int j=i+1; j<n; j++){ //second Number
                if(arr[i] == arr[j]) //found answer
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int lastRepeatingNumber(int[] arr)
    {
        int n = arr.length;
        int lastRepeatingNo = -1;
        for(int i=0; i<n; i++) //first Number
        {
            for(int j=i+1; j<n; j++){ //second Number
                if(arr[i] == arr[j]) //found answer
                {
                    lastRepeatingNo = arr[i];
                }
            }
        }
        return lastRepeatingNo;
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
        int firstRepeatingNumber = firstRepeatingNumber(arr);
        System.out.println("First Repeating number: "+firstRepeatingNumber);

        int lastRepeatingNumber = lastRepeatingNumber(arr);
        System.out.println("Last Repeating number: "+lastRepeatingNumber);

    }

    
}
