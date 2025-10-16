package Pattern;

import java.util.Scanner;
/*
        1234
        1234
        1234
        1234
 */

public class NumRectPattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        

        for(int i = 1; i <= r; i++)
        {
            for(int j = 1; j <= r; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
