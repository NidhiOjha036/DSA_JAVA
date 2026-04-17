package LinkedList.SinglyLinkedList;

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

    

        //fast.next.next != null -> for even number of nodes -- Middle Element: 4
        // while(fast.next != null && fast.next.next !=null)
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

    //right middle
    static Node deleteMiddle(Node head)
    {
        if(head.next == null) return null;
        Node slow = head;
        Node fast = head;

        while(fast.next.next != null && fast.next.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    static Node deleteLeftMiddle(Node head)
    {
        if(head.next == null) return null;
        Node slow = head;
        Node fast = head;

        while(fast.next.next.next != null && fast.next.next.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    static void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
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

        // Node newNode = deleteMiddle(a); //100 13 4 12 10 
        // display(newNode);

         Node newNode = deleteLeftMiddle(a); //100 13 5 12 10 
        display(newNode);



    }
}
