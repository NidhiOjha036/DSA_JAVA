package Loop;

import java.util.Scanner;

//Count of digits in a number
public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Enter num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original_num = n;
        int countOfDigits=0;

        while (n > 0) {
            n = n/10;
            countOfDigits++;
        }
        System.out.println("Number of Digits in "+original_num+" = "+countOfDigits);
    }
}
