package Pattern;

import java.util.Scanner;

/*
   1
  2 2
 3   3
4444444
 */

public class NumHollowPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int r = sc.nextInt();
        

        for(int i = 1; i <= r; i++)
        {
            //print r-i spaces
            for(int j = 1; j <= r-i; j++){
                System.out.print(" ");
            }

            // print 2*i-1 
            for(int k = 1; k <= 2*i-1; k++){
                if(k==1 || k==2*i-1 || i==r )
                {
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
    
}
