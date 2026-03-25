package Sorting;

//Given a sorted array arr[]. Find the element that appears only once in the array. 
// All other elements appear exactly twice. 
public class SingleDoubleSorted {
    static int findOnce(int[] a)
    {
        int n = a.length;
        if(n==1) return a[0];
        if(a[0] != a[1]) return a[0];
        if(a[n-1] != a[n-2]) return a[n-1];
        int st=0, end=n-1;
        while(st<=end)
        {
            int mid = st+(end-st)/2;
            if(a[mid] != a[mid-1] && a[mid] != a[mid+1]) return a[mid];    
            int f=mid,s=mid;    
            if(a[mid] == a[mid-1]) f=mid-1;
            else s=end-s;
            int leftCount = f-st;
            int rightCount = end-s;
            if(leftCount%2==0) st = s+1;
            else end = f-1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        System.out.println(findOnce(a));
    }
}