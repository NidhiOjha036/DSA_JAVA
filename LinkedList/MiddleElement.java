package LinkedList;

public class MiddleElement {

    public static class Node
    {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node findMiddleElement(Node head)
    {
        Node slow = head;
        Node fast = head;

        //self tried...
        // // fast = 2x speed of slow
        // fast = fast.next.next;

        // while(fast != null)
        // {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }

        // return slow;

        //fast.next.next != null -> for even number of nodes -- Middle Element: 4
        // while(fast != null && fast.next.next !=null)
        // {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // return slow;

        // left middle -> fast.next != null -> odd
        //right middle -> fast != null -> even
        while(fast != null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //Middle Element: 5
    }

    public static void main(String[] args) {

        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;  //[100,13,4,5,12,10]

        Node middleNode = findMiddleElement(a);
        System.out.println("Middle Element: "+middleNode.data);


    }
}
