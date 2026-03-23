package Sorting.lect_46;

public class PeakIndexMountainArray {

    static int peakIndex(int[] a)
    {
        int n = a.length;
        int st=1, end = n-2; //first and last element cannot be peak

        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(a[mid]>a[mid+1] && a[mid]>a[mid-1]) return mid; 
            else if(a[mid]<a[mid+1]) st = mid+1; // go right (increasing slope)
            else end = mid-1; // go left (decreasing slope)
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndex(arr));
    }
}
