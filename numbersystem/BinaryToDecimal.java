package numbersystem;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Enter Binary num: ");
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();
        int ans = 0; //decimal
        int pw = 1;  //powers of 2^0
        while(binary_num > 0){
            int unit_digit = binary_num % 10;
            ans += unit_digit * pw;
            binary_num /= 10;
            pw *= 2;
        }
        System.out.println(ans);
    }
}
