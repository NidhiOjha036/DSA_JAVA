package Loop;

public class Armstrong {

    static boolean armstrong(int n)
    {
        int sum=0;
        int temp=n;
        while (n!=0) {
            int fact=1;
            int rem = n%10;
            for(int i=1; i<=rem; i++)
            {
                fact*=i;
            }
            sum+=fact;
            n=n/10;
        }
        System.out.println(temp);
        System.out.println(sum);
        if(temp == sum) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println("ArmStrong Number: "+armstrong(145));
    }
}
