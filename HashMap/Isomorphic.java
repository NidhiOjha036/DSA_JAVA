package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {


    static boolean isIsomorphic(String s, String t)
    {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> mp = new HashMap<>();
        HashSet<Character> hs = new HashSet<>();
       
        for(int i=0; i<s.length(); i++)
        {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);

            if(mp.containsKey(sCh)){
                if(mp.get(sCh) != tCh) return false; //consistent mapping
            }else if(!hs.add(tCh)){ // tc - o(1)
                return false;
            }else{
                mp.put(sCh, tCh);
                hs.add(tCh);
            }
        }

        return true;

    }

    public static void main(String[] args) {
       String s = "egg";
       String t = "add";
       System.out.println(isIsomorphic(s, t));
    }
}
