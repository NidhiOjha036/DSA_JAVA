package Recursion.lect_37;

//Move all 0’s to end, maintaining the relative order.
public class MoveZeroesToEnd {

    static void sortZeroes(int[] a)
    {
        int n = a.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(a[j]==0 && a[j+1] != 0)
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int val : a)
        {
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        sortZeroes(a);
    }
}
