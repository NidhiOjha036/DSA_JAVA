package Loop;

import java.util.Scanner;

//Finding a raised-to-power b
public class RaisePower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int ans = 1;

        for(int i = 1; i <= b; i++){
            ans *= a;
        }
        System.out.println(a+" raise to "+b+" = "+ans);

    }
}
