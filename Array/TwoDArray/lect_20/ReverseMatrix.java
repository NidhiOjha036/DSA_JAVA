package Array.TwoDArray.lect_20;

import java.util.Scanner;

public class ReverseMatrix {


    static void reverse(int[][] a, int r1, int c1) {
    int[][] rev = new int[r1][c1];

    for (int i = 0; i < r1; i++) {
        int k = 0; // reset for each row
        for (int j = c1 - 1; j >= 0; j--) {
            rev[i][k++] = a[i][j];
        }
    }

    System.out.println("Reverse Array");
    printMatrix(rev);
}

static void inplaceReverse(int[][] a)
{
    for (int i = 0; i < a.length; i++) {
        for (int j = 0, k = a[i].length - 1; j < k; j++, k--) {
            int temp = a[i][j];
            a[i][j] = a[i][k];
            a[i][k] = temp;
        }
    }
    System.out.println("Inplace Reverse Array");
    printMatrix(a);

}


    static void printMatrix(int[][] matrix)
    {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];
        System.out.println("Enter matrix values");
        for(int i=0; i<r1; i++)
        {
            for(int j=0; j<c1; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        reverse(a, r1, c1);
        inplaceReverse(a);
    }
    
}
