package Recursion.lect_34;

import java.util.Scanner;

public class Reverse {

    static String reverse(String s, int idx)
    {
        if(idx==s.length()) return "";
        String smallAns = reverse(s, idx+1);
        return smallAns + s.charAt(idx);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s = "aaaa";
        //System.out.println(reverse(s, 0));
        String rev = reverse(s, 0);
        if(rev.equals(s))
        {
            System.out.printf("%s is Palindrome",s);
        }else{
            System.out.printf("%s is not Palindrome",s);
        }
    }
}
