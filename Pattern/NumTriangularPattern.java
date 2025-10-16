package Pattern;

import java.util.Scanner;

/*
        1
        12
        123
        1234
        12345
 */

public class NumTriangularPattern {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        

        for(int i = 1; i <= r; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
