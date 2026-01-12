package Recursion.lect_31;

public class ArmstrongRecur {

    static int fact(int n)
    {
        if(n==0) return 1;
        return n*fact(n-1);
    }

    static int armstrong(int n)
    {
        if(n==0) return 0;
        else return fact(n%10) + armstrong(n/10);
    }

    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        if(armstrong(n)==temp)
        {
            System.out.println(temp+" is a armstrong number");
        }else
        {
            System.out.println(temp+" is not a armstrong number");
        }
    }
    
}
