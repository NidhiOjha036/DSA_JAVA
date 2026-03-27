package String;

public class Palindrome {
    public static void main(String[] args) {
        String s="abcdcba";
        int i=0, j=s.length()-1;
        boolean isPalindrome=true;
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                isPalindrome=false;
                break;
            }
            i++;
            j--;
        }

        if(isPalindrome) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
       
    }
}
