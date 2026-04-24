package Stack;

import java.util.Stack;

public class NextGreaterElement {

    static int[] nextGreaterEle(int[] arr)
    {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        res[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2; i>=0; i--){
            while(st.size() > 0 && st.peek() < arr[i])
            {
                st.pop();
            }
            if(st.size()==0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {

        int[] arr = {1,3,2,1,8,6,3,4};
        //int[] res = new int[arr.length];
        int[] res = nextGreaterEle(arr);


        // for(int i=0; i<arr.length; i++)
        // {
        //     res[i]=-1;
        //     for(int j=i+1; j<arr.length; j++)
        //     {
        //         if(arr[j]>arr[i])
        //         {
        //             res[i] = arr[j];
        //             break;
        //         }
        //     }
        // }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int j=0; j<res.length; j++)
        {
            System.out.print(res[j]+" ");
        }

    }
}
