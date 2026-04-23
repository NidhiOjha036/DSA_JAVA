package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    static boolean isBalancedBracket(String str)
    {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        
        for(int i=0; i<n; i++)
        {
            char ch = str.charAt(i);
            if(ch=='(')
            {
                st.push('(');
            }else{ //(ch==')'
                if(st.size() == 0) return false;
                else if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) return false;
        else return true;
    }

    //No of brackets remove to make sequence balanced
    static int unBalancedBracketCount(String str)
    {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int count=0;
        
        for(int i=0; i<n; i++)
        {
            char ch = str.charAt(i);
            if(ch=='(')
            {
                st.push('(');
                count++;
            }else{ //(ch==')'
                if(st.size() == 0) return 0;
                else if(st.peek()=='('){
                    st.pop();
                    count--;
                } 
            }
        }
        if(st.size()>0) return count;
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check balance bracket: ");
        String str = sc.nextLine();
        System.out.println(isBalancedBracket(str));
        System.out.println("Number of unbalance brackets "+unBalancedBracketCount(str));

    }
}
