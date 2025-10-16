package Loop;

import java.util.Scanner;

//Reversing the digits of a number 
public class ReverseDigits {
    public static void main(String[] args) {

        System.out.print("Enter num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int original_num = n;
        int reverse=0;

        while (n>0) {
            reverse = reverse*10 + n%10;
            n/=10;
        }
        System.out.println("Reverse of "+original_num+" = "+reverse);

    }
}
