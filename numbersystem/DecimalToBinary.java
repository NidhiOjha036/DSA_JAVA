package numbersystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter Decimal num: ");
        Scanner sc = new Scanner(System.in);
        int decimal_num = sc.nextInt();
        int binary_num = 0;
        int pw = 1;  //powers of 10

        while (decimal_num > 0) {
            int parity = decimal_num % 2;  //The parity of a given number relies only on its remainder after being divided by 2.
            binary_num += (parity * pw);
            pw *= 10;
            decimal_num /= 2;
        }
        System.out.println(binary_num);
    }
}
