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

    public static void main(String[] args) {
        int[] arr = {1,2,4,6};
        int target = 5;
        if(search(arr, target, 0))
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
