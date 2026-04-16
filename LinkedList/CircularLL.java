package LinkedList;

public class CircularLL {

    public static class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static void display(Node head)
    {
        System.out.print(head.data+" ");
        Node temp = head.next;
        while(temp != head)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        Node a = new Node(5);
        System.out.println(a.next);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        //5->3->9->8->16
        a.next = b; //5->3
        b.next = c; //5->3->9
        c.next = d; ///5->3->9->8
        d.next = e; ////5->3->9->8->16
        e.next = a;
        display(a);

    }
}
