package Array.TwoDArray.lect_21;

import java.util.Scanner;

public class TransposeMatrix {

    static void transposeInPlace(int[][] matrix, int r, int c)
    {
        for(int i=0; i<c; i++)
        {
            for(int j=i; j<r; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static int[][] findTransposeMatrix(int[][] matrix, int r, int c)
    {
        int[][] transpose = new int[c][r];
        for(int i=0; i<c; i++)
        {
            for(int j=0; j<r; j++)
            {
                transpose[i][j]=matrix[j][i];
            }
        }
        return transpose;
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
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("Enter "+totalElements+" values");
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix");
        printMatrix(matrix);

        // System.out.println("Transpose of matrix");
        // int[][] ans = findTransposeMatrix(matrix, r, c);
        // printMatrix(ans);

        System.out.println("Inplace transpose matrix");
        transposeInPlace(matrix, r, c);
        printMatrix(matrix);
        
    }


    
}
