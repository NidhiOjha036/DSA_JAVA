package Loop;

//Sum of digits of a number

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Enter num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original_num = n;
        int sumOfDigits = 0;

        while (n>0) {
            sumOfDigits += n%10;
            n /= 10;
        }
        System.out.println("Sum of digit in "+original_num+" = "+sumOfDigits);
    }
}
