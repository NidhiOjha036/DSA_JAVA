package Recursion.lect_31;

public class MultiplicationTwoNum {

    static int mul(int x, int y)
    {
        if(y==0) return 0;
        return x+mul(x, y-1);
    }

    public static void main(String[] args) {
        System.out.println(mul(5, 4));
    }
    
}
