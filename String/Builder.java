package String;

public class Builder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("hello");
        System.out.println(str); // hello
        str.setCharAt(0, 'm');
        System.out.println(str); //mello
        str.append(10);
        System.out.println(str); //mello10
        str.insert(2, 'y');
        System.out.println(str); //meyllo10
        str.reverse();
        System.out.println(str);

    }
    
}
