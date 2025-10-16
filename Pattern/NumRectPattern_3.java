package Pattern;

import java.util.Scanner;
/*
            12121
            21212
            12121
            21212
            12121
 */

public class NumRectPattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter col: ");
        int c = sc.nextInt();
        

        for(int i = 1; i <= r; i++)
        {
            for(int j = 1; j <= c; j++){

                if((i+j)%2 == 0)
                {
                    System.out.print(1);
                }else{
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
