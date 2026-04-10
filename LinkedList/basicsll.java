package LinkedList;


public class basicsll {

     public static void reverseDisplay(Node head)
    {
        if(head==null) return;
        reverseDisplay(head.next);
        System.out.print(head.data+" ");
    }

    public static void displayR(Node head)
    {
        if(head==null) return;
        System.out.print(head.data+" ");
        displayR(head.next);
    }

    public static void display(Node head)
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    public static int length (Node head)
    {
        int count=0;
        while(head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void insertAtEnd(Node head, int val)
    {
        Node temp = new Node(val);
        Node t = head;
        while(t.next != null)
        {
            t = t.next;
        }
        t.next = temp;
    }

    public static class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data = data;
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
        System.out.println(a.next); 
        b.next = c; //5->3->9
        c.next = d; ///5->3->9->8
        d.next = e; ////5->3->9->8->16

        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);
        // System.out.println(a.next.next.next.next.data);

        display(a);
        System.out.println();
        displayR(a);//Recursive display
        System.out.println();
        reverseDisplay(a);
        System.out.println();
        System.out.println("Length: "+length(a));
        insertAtEnd(a, 87);
        display(a);
       
    }

    
}
