package Recursion.lect_29;

public class Power {

    // static int pow(int p, int q)
    // {
    //     if(q==0) return 1;

    //     return pow(p, q-1) * p;
    // }

    static int pow(int p, int q)
    {
        //base
        if(q==0) return 1;

        int smallPow = pow(p, q/2);
        //even
        if(q%2==0)
        {
            return smallPow * smallPow;
        }
        //odd
        return p * smallPow * smallPow;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }

}
