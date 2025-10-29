package Array.single_multi_Array.SwapRevRotArr_lect4;

//Q1.Swap using temporary variable
public class SwapVal {

    static void swapWithoutTemp(int a, int b)
    {
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    static void swap(int a, int b)
    {
        System.out.println("Original values before swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }

    public static void main(String[] args) {
        //swap(9, 3);
        swapWithoutTemp(9, 3);
    }

}
