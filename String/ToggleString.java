package String;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {

        String str = "PhYSiCS";
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
                str = str.substring(0, i) + upperChar + str.substring(i+1);

            }else{ //small
                ascii -= 32;
                char lowerChar = (char)ascii;
                str = str.substring(0, i) + lowerChar + str.substring(i+1);
;
            }

        }
        System.out.println(str); //pHysIcs
    }
}
