package Sorting.lect_46;

public class SearchInDescending {

    static int searchDescending(int[] a,int target)
    {
        int n = a.length;
        int st=0, end=a.length-1;

        while(st<=end)
        {
            int mid = st+(end-st)/2;
            if(a[mid]==target) return mid;
            else if(a[mid]<target) end = mid-1;
            else st = mid+1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] a = {97, 95, 89, 84, 81, 67, 51, 49, 43, 22, 21, 15, -7};
        int target1 = 22;
        int target2 = 100;
        System.out.println("Index of " + target1 + ": " + searchDescending(a, target1)); // Output: 9
        System.out.println("Index of " + target2 + ": " + searchDescending(a, target2)); // Output: -1
    }
}
