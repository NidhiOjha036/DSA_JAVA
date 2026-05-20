package Stack;

import java.util.Stack;

public class LargestAreaHistogram {

    static int[] nextSmaller(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];
        ans[n-1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for(int i=n-2; i>=0; i--)
        {
            while(st.size() > 0 && arr[st.peek()]>=arr[i])
            {
                st.pop();
            }
            if(st.size()>0) ans[i] = st.peek();
            else ans[i] = n;
            st.push(i);
        }
        return ans;
    }

    static int largestRectangleArea(int[] heights)
    {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        int[] nse = new int[n];
        int[] pse = new int[n];

        //calculate nse[]
        st.push(n-1);
        nse[n-1] = n;
        for(int i=n-2; i>=0; i--)
        {
            while(st.size() > 0 && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.size()>0) nse[i] = st.peek();
            else nse[i] = n; //st==0
            st.push(i);
        }

        //empty stack
        while(st.size()>0) st.pop();

        //calculate pse[]
        st.push(0);
        pse[0] = -1;

        for(int i=1; i<n; i++)
        {
            while(st.size() > 0 && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.size()>0) pse[i] = st.peek();
            else pse[i] = -1; //st==0
            st.push(i);
        }

        //maximum area of rectangle
        int max = -1;
        for(int i=0; i<n; i++)
        {
            int area = heights[i]*(nse[i] - pse[i] - 1);
            max = Math.max(max,area);
        }
        return max;

    }

    public static void main(String[] args) {
    //    int[] arr = {5,2,4,6,3,5};
    //    int[] ans = nextSmaller(arr);
    //    for(int i=0; i<ans.length; i++)
    //    {
    //         System.out.print(ans[i]+" ");
    //    }

        //int[] heights = {2,1,5,6,2,3};
        int[] heights = {1,1};
        System.out.println(largestRectangleArea(heights));
    }
}
