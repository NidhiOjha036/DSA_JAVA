package Recursion.lect_33;

public class IsSortedRecursion {

    static boolean isSorted(int[] a, int idx)
    {
        if(idx==a.length-1) return true;

        if(a[idx] > a[idx+1]) return false;

        return isSorted(a, idx+1);

    }

    public static void main(String[] args) {
        int[] a = {1,2,1};
        System.out.println("IsSorted: "+isSorted(a, 0));
    }
    
}
