package Array.single_multi_Array;

public class SearchEleInArray {
    public static void main(String[] args) {
        int[] arr = {10,5,3,6,2,8,4,2};
        int ans = -1;
        int x = 2;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x){
                ans = i;
                break;
            }
        }
        System.out.println("Found "+x+" at index "+ans);

    }
}