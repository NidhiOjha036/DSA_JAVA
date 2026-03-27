package String;

import java.util.Scanner;

//Toggle the characters of a given string
public class Toggle {
    public static void main(String[] args) {
        System.out.print("Enter String : ");
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i=0; i<str.length(); i++)
        {
            boolean flag = true; // Capital
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int ascii = (int)ch;

            if(ascii >= 97) flag = false;

            if(flag == true) //capital
            {
                ascii += 32;
                char upperChar = (char)ascii;
                str.setCharAt(i, upperChar);

            }else{ //small
                ascii -= 32;
                char lowerChar = (char)ascii;
                str.setCharAt(i, lowerChar);
            }


        }
        System.out.println(str);
    }
}
