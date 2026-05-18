package Stack;
import java.util.Stack;

public class StockSpanPrevGreater {

    static int[] previousGreater(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        res[0] = 1;
        st.push(0);
        for(int i=1; i<n; i++)
        {
            while(st.size()>0 && arr[st.peek()] <= arr[i])
            {
                st.pop();
            }
            if(st.size()>0) res[i] = i - st.peek();
            else res[i] = i+1;
            st.push(i);
        }
        return res;
    }

    

    
    public static void main(String[] args) {

        int[] arr = {100,80,60,70,60,75,85};
        int[] res = previousGreater(arr);
        for(int i=0; i<res.length; i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}
