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
        // Step 1: Push first k elements into stack
        for(int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        while(!st.isEmpty()) {
            q.add(st.pop());
        }
        
        // Step 3: Move remaining elements to back
        int size = q.size();
        for(int i = 0; i < size - k; i++) {
            q.add(q.remove());
        }

        System.out.println(q);
    }
}
