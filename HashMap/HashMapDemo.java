package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        //Adding elements
        mp.put("Akash", 21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);

        //Getting value of a key from the hashmap
        System.out.println(mp.get("Yash")); //16
        System.out.println(mp.get("Rahul")); //null

        //Changing/updating vallue of a key in the hashmap
        mp.put("Akash", 26);
        System.out.println(mp.get("Akash"));

        //Removing a pair from the Hashmap
        System.out.println(mp.remove("Akash")); //26
        System.out.println(mp.remove("riya")); //null

        //Checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Akash")); //false
        System.out.println(mp.containsKey("Yash")); //true

        //Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 30); //will enter
        mp.putIfAbsent("Yash", 30); //will not enter

        //Get all keys in the Hashmap
        System.out.println(mp.keySet()); //[Lav, Rishika, Yash, Harry, Yashika]

        //Get all values in the Hashmap
        System.out.println(mp.values()); //[17, 19, 16, 18, 30]

        //Get all the enteries in the HashMap
        System.out.println(mp.entrySet()); //[Lav=17, Rishika=19, Yash=16, Harry=18, Yashika=30]

        //Traversing all enteries of HashMap - multiple methods
        for(String key: mp.keySet())
        {
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String, Integer> e : mp.entrySet())
        {
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        
        for(var e : mp.entrySet())
        {
           System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

    }
}
