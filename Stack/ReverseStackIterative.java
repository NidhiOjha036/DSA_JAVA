package Stack;

import java.util.Stack;

public class ReverseStackIterative {

    static void pushAtBottom(Stack<Integer> st, int x)
    {
        if(st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);

    }

    static void reverse(Stack<Integer> st)
    {
        if(st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st); // [1, 2, 3, 4, 5]
        //Stack<Integer> rst = new Stack<>();
        // while(st.size()>0)
        // {
        //     rst.push(st.pop());
        // }
        // System.out.println(rst); //[5, 4, 3, 2, 1]
        // Stack<Integer> ost = new Stack<>(); //[1, 2, 3, 4, 5]
        // while(rst.size()>0){
        //     ost.push(rst.pop());
        // }
        // System.out.println(ost);
        // while(ost.size()>0)
        // {
        //     st.push(ost.pop());
        // }
        // System.out.println(st); //[5, 4, 3, 2, 1]
        reverse(st);
        System.out.println(st);
    }
}
