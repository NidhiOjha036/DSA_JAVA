package HashSet;

import java.util.HashSet;

public class LongestConsecutive {

    static int logestConsecutive(int[] nums)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums) hs.add(num);
        int maxLen=0;
        for(int num : hs)
        {
            if(!hs.contains(num-1))
            {
                int currNum = num;
                int currLen=1;
                while(hs.contains(currNum+1))
                {
                    currNum++;
                    currLen++;
                }
                maxLen = Math.max(maxLen, currLen);
            }  
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(logestConsecutive(nums));
    }
}
