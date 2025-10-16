package Loop;

import java.util.Scanner;

//Sum of a given series
public class SumSeries {
    public static void main(String[] args) {
        
        System.out.print("Enter num: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){
            if(i%2 == 0){
                sum -= i;
            }else {
                sum += i;
            }
        }
        System.out.println("Sum of given num: "+sum);
        
    }
}
