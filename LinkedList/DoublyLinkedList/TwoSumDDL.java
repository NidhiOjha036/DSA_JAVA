package LinkedList.DoublyLinkedList;

//Two sum in a double linked list -> Sorted List(Non decreasing order)
public class TwoSumDDL {
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
    static void twoSum(int target,Node head, Node tail)
    {
        Node tHead = head;
        Node tTail = tail;
        while (tHead.val < tTail.val) {
            int sum = tHead.val + tTail.val;
            if(sum == target)
            {
                System.out.println("Sum: "+sum);
                return;
            }
            else if(sum < target) tHead = tHead.next;
            else tTail = tTail.prev; //sum>target
        }
    }
    public static void main(String[] args) {

        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(13);
        Node e = new Node(100);

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

        twoSum(16, a, e);

    }
}
