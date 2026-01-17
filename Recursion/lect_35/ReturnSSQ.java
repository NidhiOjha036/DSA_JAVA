package Recursion.lect_35;

import java.util.ArrayList;

public class ReturnSSQ {

    static ArrayList<String> getSSQ(String s)
    {
        ArrayList<String> ans = new ArrayList<>();

        //base case
        if(s.length() == 0)
        {
            ans.add("");
            return ans;
        }
        char currChar = s.charAt(0); //a
        ArrayList<String> smallAns = getSSQ(s.substring(1)); //["bc,"b","c",""]

        for(String ss: smallAns)
        {
            ans.add(ss);
            ans.add(currChar+ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for(String s:ans)
        {
            System.out.println(s);
        }
    }
}
