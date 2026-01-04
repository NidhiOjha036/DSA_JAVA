package Recursion.lect_27;

import java.util.Scanner;

public class NaturalNum {

    static void printDecreasing(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

    static void printIncreasing(int n)
    {
            //base case
            if(n==1)
            {
                System.out.println(1);
                return;
            }

            //recursive work
            printIncreasing(n-1);
            
            //self work
            System.out.println(n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        //printIncreasing(n);
        printDecreasing(n);

    }
    
}
