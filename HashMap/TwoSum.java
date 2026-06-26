package HashMap;

import java.util.HashMap;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] ans = {-1};

        for(int i=0; i<nums.length; i++)
        {
            int partner = target - nums[i];
            if(mp.containsKey(partner))
            {
                ans = new int[]{mp.get(partner),i};
            }
             mp.put(nums[i], i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        for(int i: ans)
        {
            System.out.print(i+" ");
        }

    }
        
}
