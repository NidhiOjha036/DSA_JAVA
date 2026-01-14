package Recursion.lect_33;

public class FindLastIndex {

    static int lastIndexTarget(int[] a, int target, int idx)
    {
        if(idx<0) return -1;

        if(a[idx]==target) return idx;

        return lastIndexTarget(a, target, idx-1);

    }

    public static void main(String[] args) {
        int[] a = {1,3,3,4};
        System.out.println(lastIndexTarget(a, 3, a.length-1));
    }
}
