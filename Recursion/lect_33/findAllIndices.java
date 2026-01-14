package Recursion.lect_33;

import java.util.ArrayList;

//Return all indices as Array List if x exists in the array
public class findAllIndices {

    static ArrayList<Integer> findAllIndices(int[] a, int n, int target,int idx)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        //base case
        if(idx >= n) return ans;

        //self work
        if(a[idx]==target)
        {
            ans.add(idx);
        }

        //recursive work
        ArrayList<Integer> smallAns = findAllIndices(a, n, target, idx+1);
        
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,2,4,4,5,4};
        int target = 4;
        int n = a.length;
        ArrayList<Integer> ans = findAllIndices(a, n, target, 0);
        for(Integer i: ans)
        {
            System.out.println(i);
        }
    }
    
}
