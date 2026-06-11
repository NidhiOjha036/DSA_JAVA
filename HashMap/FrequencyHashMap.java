package HashMap;

import java.util.HashMap;
import java.util.Map;

//Max frequency
public class FrequencyHashMap {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,4,1};
        int n=6;
        Map<Integer, Integer> mp = new HashMap<>();

        for(int el: arr)
        {
            if(!mp.containsKey(el)) //false 
            {
                mp.put(el, 1);
            }else{
                mp.put(el, mp.get(el)+1);
            }
        }
        System.out.println(mp.entrySet());
        int maxFreq = 0;
        int ansKey = -1;
        // for(var e: mp.entrySet())
        // {
        //     if(e.getValue() > maxFreq)
        //     {
        //         maxFreq = e.getValue();
        //         ansKey = e.getKey();
        //     }
        // }

        for(var key: mp.keySet())
        {
            if(mp.get(key) > maxFreq)
            {
                maxFreq = mp.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times",ansKey, maxFreq);
    }
}
