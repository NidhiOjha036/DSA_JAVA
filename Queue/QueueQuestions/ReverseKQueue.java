package Queue.QueueQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        int k = 3;
        Stack<Integer> st = new Stack<>();
        while(q.size()>=k)
        {
            st.push(q.remove());
        }
        //System.out.println(q);
        while(st.size()>0)
        {
            q.add(st.pop());
        }
        //System.out.println(q);
        for(int i=1; i<=q.size()-k; i++)
        {
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
