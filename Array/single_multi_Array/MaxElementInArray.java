package Array.single_multi_Array;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,5,3};
        int mx = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        System.out.println("Largest element in Array "+mx);
    }
}
