package Sorting.lect_48_BinarySearchOnAns;

public class DistributeChocolates {

    static int distributeChocolates(int[] a, int m)
    {
        if(a.length < m) return -1;
        int ans=0, st=1, end=(int)1e9;

        while(st<=end)
        {
            int mid = st+(end-st)/2;
            if(isDivisionPossible(a,m,mid))
            {
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }

        return ans;
    }

    static boolean isDivisionPossible(int[] a, int m, int mxChocAllowed)
    {
        int numOfStudents = 1;
        int choc = 0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i] > mxChocAllowed) return false;
            if(choc+a[i] <= mxChocAllowed)
            {
                choc += a[i];
            }else{
                numOfStudents++;
                choc = a[i];
            }
        }
        return numOfStudents<=m;
    }

    public static void main(String[] args) {
        int[] a = {5,3,1,4,2};
        int m=3;
        // int[] a = {12,34,67,90};
        // int m=2;
        System.out.println(distributeChocolates(a, m));

    }
}
