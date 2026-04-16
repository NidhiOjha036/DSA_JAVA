package LinkedList.DoublyLinkedList;

public class PalindromeDDL {

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

    static boolean isPalindrome(Node head, Node tail)
    {
        Node tempH = head;
        Node tempT = tail;
        while(tempH != tempT)
        {
            if(tempH.val != tempT.val) return false;
            tempH = tempH.next;
            tempT = tempT.prev;
        }
        return true;
    }

    public static void main(String[] args) {

        Node a = new Node(4);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(1);
        Node e = new Node(4);

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

        System.out.println("isPalindrome: "+isPalindrome(a, e));
    }
}
