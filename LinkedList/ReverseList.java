package LinkedList;

public class ReverseList {

    public static class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
        }
    }
    //TC - O(n), SC-> O(n) ,leetcode - 206
    public static Node reverse(Node head)
    {
        if(head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;  //Interchanging the connection
        head.next=null;
        return newHead;
    }
    public static Node reverseIterative(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr != null)
        {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static boolean isPalin(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverseIterative(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = slow.next;
        while(p2!=null)
        {
            if(p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

        public static boolean isPalindrome(Node head) {
        // Step 1: create deep copy
        Node copy = null, tail = null;
        Node temp = head;

        while (temp != null) {
            Node newNode = new Node(temp.val);
            if (copy == null) {
                copy = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            temp = temp.next;
        }

        // Step 2: reverse the copy
        Node rHead = reverseIterative(copy);

        // Step 3: compare original and reversed copy
        Node oHead = head;
        while (oHead != null && rHead != null) {
            if (oHead.val != rHead.val) {
                return false;
            }
            oHead = oHead.next;
            rHead = rHead.next;
        }

        return true;
    }

    static void display(Node head)
    {
        if(head == null) 
        {
            System.out.println();
            return;
        }       
        System.out.print(head.val+" ");
        display(head.next);
    }
    public static void main(String[] args) {

        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // display(a);
        // //a = reverse(a);
        // a = reverseIterative(a);
        display(a);
       // System.out.println("IsPalinddrome: "+isPalindrome(a));
       System.out.println("isPalin: "+isPalin(a));
        
    }
}
