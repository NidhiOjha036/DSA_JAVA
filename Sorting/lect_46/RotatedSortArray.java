package Sorting.lect_46;

//Return the index of the target integer.
public class RotatedSortArray {

    static int search(int[] a, int target)
    {
        int n = a.length-1;
        int st=0, end = n;
        while (st<=end) {
            int mid = st+(end-st)/2;
            if(a[mid] == target) return mid;
            else if(a[mid]<a[end]) { //mid to end is sorted
                if(target>a[mid] && target<=a[end]) st=mid+1;
                else end = mid-1;
            }
            else{ //st to mid is sorted
                if(target>=a[st] && target<a[mid]) end=mid-1;
                else st=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};
        int target = 2;
        System.out.println(search(a,target));
    }
}
