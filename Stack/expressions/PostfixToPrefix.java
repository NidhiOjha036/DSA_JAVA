package Stack.expressions;

import java.util.Stack;

public class PostfixToPrefix {
     public static void main(String[] args) {
        String str = "953+4*6/-"; //postfix 
        Stack<String> val = new Stack<>();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57)
            {
                String s = ""+(ascii - 48);
                val.push(s);
            }else{
                String v2 = val.pop();
                String v1 = val.pop();
                String s = ""+ch+v1+v2;
                val.push(s);
            }
        }
        System.out.println(val.peek()); // -9/*+5346     -> prefix
     }
}
