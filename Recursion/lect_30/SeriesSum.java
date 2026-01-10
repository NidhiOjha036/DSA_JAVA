package Recursion.lect_30;

public class SeriesSum {

    static int seriesSum(int n)
    {

        if(n==0) return 0;

        //Even
        if(n%2 == 0) return seriesSum(n-1) - n;

        //Odd
        return seriesSum(n-1) + n;

    }

    static int seriesSum1(int n)
    {
        if(n==0) return 0;
        return seriesSum1(n-1) + n;
    }

    public static void main(String[] args) {
        System.out.println("seriesSum: "+seriesSum(5));
        System.out.println("seriesSum1: "+seriesSum1(5));

    }
    
}
