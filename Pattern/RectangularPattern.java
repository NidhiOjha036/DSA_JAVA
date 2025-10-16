package Pattern;

import java.util.Scanner;

//Rectangular Pattern
public class RectangularPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        System.out.print("Enter column: ");
        int c = sc.nextInt();

        for(int i = 1; i <= r; i++)
        {
            for(int j = 1; j <= c; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
