package LinkedList.DoublyLinkedList;

public class DoublyLL {

    public static class Node
    {
        int val;
        Node next;
        Node prev;

        Node(int val)
        {
            this.val = val;
        }
    }

    public static Node insertAtHead(Node head, int x)
    {
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;

        return head;
    }

    public static void insertAtTail(Node head,int x)
    {
        Node temp = head;
        Node t = new Node(x);
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = t;
        t.prev = temp;
        temp = t;
    }

    public static void insertAtIdx(Node head,int idx, int x)
    {
       Node s = head;
       for(int i=1; i<=idx-1; i++)
       {
            s = s.next;
       }
       Node r = s.next; //idx
       Node t = new Node(x);
       s.next = t;
       t.prev = s;
       t.next = r;
       r.prev = t;
    }

    static Node deleteHead(Node head)
    {
        head = head.next;
        head.prev = null;
        return head;
    }

    static Node deleteTail(Node head)
    {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
        return head;
    }

    public static Node deleteAtIdx(Node head,int idx)
    {
       Node temp = head;
       for(int i=1; i<=idx-1; i++)
       {
            temp = temp.next;
       }
       temp.next = temp.next.next;
       temp.next.prev = temp;
       return head;
    }

    public static void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displaRev(Node tail)
    {
        Node temp = tail;
        while(temp != null)
        {
            System.out.print(temp.val+ " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display2(Node random)
    {
        Node temp = random;
        //move this temp backward to the head
        while(temp.prev != null)
        {
            temp = temp.prev;
        }
        //now temp is at head
        //print the list
        display(temp);
    }

    public static void main(String[] args) {

        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;

        // display(a);
        // displaRev(e);
        //display2(c);

        // Node newHead = insertAtHead(a, 35);
        // display(newHead);

        //insertAtTail(a, 90);
        //insertAtIdx(a, 3, 56);
        display(a);
        // a = deleteHead(a);
        // display(a);

        // a = deleteTail(a);
        // display(a);

        a = deleteAtIdx(a, 2);
        display(a);
    }
}
