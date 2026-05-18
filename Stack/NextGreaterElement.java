package Stack;

import java.util.Stack;

public class NextGreaterElement {

    //backward travesing
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

    static int[] greater(int[] arr)
    {
    int n = arr.length;
    int[] ans = new int[n];

    Stack<Integer> st = new Stack<>();

    for(int i = 0; i < n; i++)
    {
        while(st.size() > 0 && arr[st.peek()] < arr[i])
        {
            ans[st.peek()] = arr[i];
            st.pop();
        }

        st.push(i);
    }

    // remaining elements have no greater element
    while(st.size() > 0)
    {
        ans[st.peek()] = -1;
        st.pop();
    }

    return ans;
    }

    public static void main(String[] args) {

        //int[] arr = {1,3,2,1,8,6,3,4};
        //int[] res = nextGreaterEle(arr);


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

        int[] arr = {1, 3, 2, 4};
        int[] res = greater(arr);
       // int[] res = nextGreaterEle(arr);

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
