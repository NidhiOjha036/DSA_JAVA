package Stack;

import java.util.Scanner;
import java.util.Stack;

public class LeetCode_20_ValidParenthesis {

    static boolean isValidSequence(String str)
    {
        Stack<Character> st = new Stack<>();
        int n = str.length();

        for(int i=0; i<n; i++)
        {
            char ch = str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            {
                st.push(ch);
            }else{ //(ch==')' || ch=='}' || ch==']')
                if(st.size() == 0) return false;
                else if((st.peek()=='(' && ch==')') || 
                        (st.peek()=='{' && ch=='}') || 
                        (st.peek()=='[' && ch==']'))
                {
                    st.pop();
                }else{
                    return false;
                }
                    
            }
        }

        if(st.size() > 0) return false;
        return true;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check valid bracket: ");
        String str = sc.nextLine();
        System.out.println(isValidSequence(str));
       
    }
}
