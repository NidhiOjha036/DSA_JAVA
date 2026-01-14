package Recursion.lect_33;

// Print whether x exists in the array or not
public class Search {

    static boolean search(int[] a, int target, int idx)
    {
        //base case
        if(idx >= a.length) return false;

        //self work
        if(a[idx] == target) return true;

        //recursive work
        return search(a, target, idx+1);

    }

    //Return first index if  x exists in the array. //[1,2,2] 
    static int findIndex(int[] a, int target, int idx)
    {
        //base case
        if(idx >= a.length) return -1;

        //self work
        if(a[idx] == target) return idx;

        //recursive work
        return findIndex(a, target, idx+1);

    } 

    //Return all indices if  x exists in the array
    static void findAllIndices(int[] a, int target, int idx)
    {
        //base case
        if(idx >= a.length) return;

        //self work
        if(a[idx] == target)
        {
            System.out.println(idx);
        }

        //recursive work
        findAllIndices(a, target, idx+1);

    } 

    public static void main(String[] args) {
        int[] arr = {1,2,2,24,6};
        int target = 2;

        // if(search(arr, target, 0))
        // {
        //     System.out.println("Yes");
        //     System.out.println("First Index "+findIndex(arr, target, 0));
        // }else{
        //     System.out.println("No");
        // }

       findAllIndices(arr, target, 0);
    }
    
}
