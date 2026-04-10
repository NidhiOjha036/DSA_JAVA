package String;

public class StringCompression {
    public static void main(String[] args) {
        
        String s = "aaabbbbccddeee";
        String ans = ""+s.charAt(0);
        int count = 1;
            

        for(int i=1; i<s.length(); i++)
        {
            char prev = s.charAt(i-1);
            char curr = s.charAt(i);

            if(curr == prev){
                count++;
            }else{
                if(count>1) ans+=count;
                count=1;
                ans+=curr;
            }

        }
        if(count>1) ans+=count;
        System.out.println(ans);

    }
}
