package Stack;

import java.util.Stack;

public class DisplayReverse {

    static void displayRecReverse(Stack<Integer> st)
    {
        if(st.size() == 0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRecReverse(st);
        st.push(top);
    }
    static void displayRec(Stack<Integer> st)
    {
        if(st.size() == 0) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }

    static void pushBottom(Stack<Integer> st,int val)
    {
        if(st.size() == 0){
            st.push(val);
            System.out.print(val+" ");
            return;
        }
        int top = st.pop();
        pushBottom(st, val);
        System.out.print(top+" ");
        st.push(top);
    }

    static void popBottom(Stack<Integer> st)
    {
        if(st.size() == 1){
            st.pop();
            return;
        }
        int top = st.pop();
        popBottom(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        displayRec(st);
        System.out.println();
        // displayRecReverse(st);
       // pushBottom(st, 6);

        popBottom(st);
    }
}
