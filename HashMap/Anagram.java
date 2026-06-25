package HashMap;

import java.util.HashMap;

public class Anagram {

    static HashMap<Character, Integer> makeFreq(String s)
    {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(!mp.containsKey(ch))
            {
                mp.put(ch, 1);
            }else{
                int currFreq = mp.get(ch);
                mp.put(ch, currFreq+1);
            }
        }
        return mp;
    }

    // static boolean isAnagram(String s, String t)
    // {
    //     if(s.length() != t.length()) return false;
    //     HashMap<Character, Integer> mp1 = makeFreq(s);
    //     HashMap<Character, Integer> mp2 = makeFreq(t);
    //     return mp1.equals(mp2);
    
    // }

    static boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> mp = makeFreq(s);
        
        for(int i=0; i<t.length(); i++)
        {
            char ch = t.charAt(i);
            if(!mp.containsKey(ch)) return false;
            int currFreq = mp.get(ch);
            if (currFreq < 0) return false; 
            mp.put(ch, currFreq-1);
        }

        for(int i : mp.values())
        {
            if(i != 0) return false;
        }

        return true;
    
    }

    public static void main(String[] args) {
        // String s1 = "listen";
        // String s2 = "silent";
        String s1 = "keen";
        String s2 = "knee";
        System.out.println(isAnagram(s1, s2));
    }
}

