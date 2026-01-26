package Recursion.lect_37;

//Sort the names of fruits in lexicographical order.
public class SortFruits {

    static void sortFruits(String[] fruits)
    {
        int n = fruits.length;
        for(int i=0; i<n-1; i++)
        {
            int min_ind = i;
            for(int j=i+1; j<n; j++)
            {
                if(fruits[j].compareTo(fruits[min_ind]) < 0)
                {
                    min_ind = j;
                }
            }
            if(min_ind != i)
            {
                String temp = fruits[i];
                fruits[i] = fruits[min_ind];
                fruits[min_ind] = temp;
            }
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"kiwi", "apple", "papaya", "mango"};
        sortFruits(fruits);
        for(String val: fruits)
        {
            System.out.print(val+ " ");
        }
    }
}
