package HashMap;

import java.util.HashMap;

public class LargestSubArray {
     static int zeroSumLargestSubArray(int[] arr)
    {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int prefSum=0, maxLength=0;
        mp.put(0, -1);
        for(int i=0; i<arr.length; i++)
        {
            prefSum += arr[i];
            if(mp.containsKey(prefSum))
            {
                maxLength = Math.max(maxLength, i-mp.get(prefSum));
            }else{
                mp.put(prefSum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(zeroSumLargestSubArray(arr));
    }
}
