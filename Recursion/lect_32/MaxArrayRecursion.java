package Recursion.lect_32;

public class MaxArrayRecursion {

    static int maxInArray(int[] arr, int idx)
    {
        if(idx==arr.length-1) return arr[idx]; //{5} -> 5

        //small Problem
        int smallAns = maxInArray(arr, idx+1);

        //self work
        return Math.max(arr[idx], smallAns);
    }
    public static void main(String[] args) {
        int[] arr = {5,16,17,8,9};
        System.out.println(maxInArray(arr, 0));
    }
}
