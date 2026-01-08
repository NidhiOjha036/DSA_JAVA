package Recursion.lect_30;

import java.util.Scanner;

public class Multiples {

    static void printMultiples(int n, int k) // 5,4
    {
        //base case
        if(k==1)
        {
            System.out.println(n);
            return;
        }

        //recursive work
        printMultiples(n, k-1); // 5 10 5

        //self work
        System.out.println(n*k);  //20
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n ");
        int n = sc.nextInt();
        System.out.println("Enter k ");
        int k = sc.nextInt();
        printMultiples(n, k);

    }
    
}
