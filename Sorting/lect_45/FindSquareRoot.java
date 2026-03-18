package Sorting.lect_45;

//Find the square root.
public class FindSquareRoot {

    static int sqrt(int x)
    {
        int st = 0, end = x;
        int ans = 1;
        while(st<=end)
        {
            int mid = st+(end-st)/2;
            int val = mid*mid;
            if(val==x) return mid;
            else if(val<x)
            {
                ans = mid;
                st = mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }

    static double precisionSqrt(int x, int precision, int tempsol)
    {
        double factor = 1;
        double ans = tempsol;
        for(int i=0; i<precision; i++)
        {
            factor = factor/10;

            // for(double j=ans; j*j<x; j=j+factor)
            // {
            //     ans = j;
            // }
            while ((ans + factor) * (ans + factor) < x) {
                ans += factor;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 24;
        //System.out.println(sqrt(x));
        int tempSol = sqrt(x);
        System.out.println(precisionSqrt(x, 3, tempSol));
    }
}
