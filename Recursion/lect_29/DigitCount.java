package Recursion.lect_29;

public class DigitCount {

    static int digitCount(int n)
    {
        if(n>0 && n<=9) return 1;
        return 1 + digitCount(n/10);
    }

    public static void main(String[] args) {
        System.out.println(digitCount(5432));
    }
    
}
