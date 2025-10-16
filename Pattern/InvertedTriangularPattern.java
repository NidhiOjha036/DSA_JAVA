package Pattern;

import java.util.Scanner;
//Inverted Triangular Pattern
/*
            ****
            ***
            **
            *
 */

public class InvertedTriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        

        for(int i = r; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
