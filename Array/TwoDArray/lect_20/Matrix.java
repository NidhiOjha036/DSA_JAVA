package Array.TwoDArray.lect_20;

import java.util.Scanner;

public class Matrix {

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2)
    {

        if(r2 != c1)
        {
            System.out.println("Multiplication not possible wrong dimension");
            return;
        }

        int[][] mul = new int[r1][c2];
        for(int i=0; i<r1; i++) // row number
        {
            for(int j=0; j<c2; j++) //col number
            {
               for(int k=0; k<c1; k++)
               {
                    mul[i][j] += (a[i][k] * b[k][j]);
               }
            }
        }

        System.out.println("Multiplication of two matrices");
        printMatrix(mul);
    }


    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2)
    {

        if(r1 != r2 || c1 != c2)
        {
            System.out.println("Wrong Input : Addition not posible");
            return;
        }

        int[][] sum = new int[r1][c1];

        System.out.println("Sum of matrix 1 and matrix 2");
        for(int i=0; i<r1; i++)
        {
            for(int j=0; j<c1; j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        printMatrix(sum);


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
        System.out.println("Enter number of rows and columns of matrix 1");
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

        System.out.println("Enter number of rows and columns of matrix 2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];
        System.out.println("Enter matrix values");
        for(int i=0; i<r2; i++)
        {
            for(int j=0; j<c2; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);

    
       // add(a, r1, c1, b, r2, c2);
       multiply(a, r1, c1, b, r2, c2);

    }
    
}
