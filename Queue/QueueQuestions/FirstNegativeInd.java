package Queue.QueueQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeInd {

    static List<Integer> firstNegInt(int arr[], int k) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++)
        {
            q.add(i);
        }
        for(int i=0; i<n-k+1; i++)
        {
            if(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek() <= i+k-1) res.add(arr[q.peek()]);
            else if(q.size() == 0) res.add(0);
            else res.add(0);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k=2;
        List<Integer> l = firstNegInt(arr, k);
        System.out.println(l);
    }
}
