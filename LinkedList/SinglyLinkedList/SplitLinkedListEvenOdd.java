package LinkedList.SinglyLinkedList;

public class SplitLinkedListEvenOdd {

     public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public static class Node {
      int data;
      Node next;
      Node(int data) {
          this.data = data;
      }
    }

//     static ListNode splitEvenOddLinkedList(ListNode list)
//     {
//         ListNode temp = list;

//         ListNode oddHead = new ListNode(-1);
//         ListNode evenHead = new ListNode(-1);

//         ListNode oddTail = oddHead;
//         ListNode evenTail = evenHead;

//         while(temp != null)
//         {
//             if(temp.val % 2 == 0) { // even
//                 evenTail.next = new ListNode(temp.val);
//                 evenTail = evenTail.next;
//             } else { // odd
//                 oddTail.next = new ListNode(temp.val);
//                 oddTail = oddTail.next;
//             }
//             temp = temp.next; // IMPORTANT
//         }

//         // connect odd list to even list
//         oddTail.next = evenHead.next;

//         return oddHead.next;
//     }

//     static ListNode splitEvenOddLinkedListWithoutSpace(ListNode head)
//     {
//     if(head == null) return null;

//     ListNode oddHead = null, oddTail = null;
//     ListNode evenHead = null, evenTail = null;

//     ListNode temp = head;

//     while(temp != null)
//     {
//         ListNode nextNode = temp.next; // store next
//         temp.next = null; // break link

//         if(temp.val % 2 == 0) { // even
//             if(evenHead == null) {
//                 evenHead = evenTail = temp;
//             } else {
//                 evenTail.next = temp;
//                 evenTail = temp;
//             }
//         } else { // odd
//             if(oddHead == null) {
//                 oddHead = oddTail = temp;
//             } else {
//                 oddTail.next = temp;
//                 oddTail = temp;
//             }
//         }

//         temp = nextNode;
//     }

//     // connect odd → even
//     if(oddTail != null)
//         oddTail.next = evenHead;

//     return (oddHead != null) ? oddHead : evenHead;
// }

    static Node divide(Node head) {
        // code here
        
        if(head == null || head.next == null) return head;
        
        
        Node t = head;
        Node odd = new Node(-1);
        Node even = new Node(-1);
        
        Node oddHead = odd;
        Node evenHead = even;
        
        
        while(t != null)
        {
            if(t.data %2 == 0)
            {
                even.next = t;
                even = t;
            }else
            {
                odd.next = t;
                odd = t;
            }
             t = t.next;
        }
        even.next = null;
        odd.next = null;
        
        even.next = oddHead.next;
        
        return evenHead.next;
    }


    public static void main(String[] args) {

        // ListNode a = new ListNode(3);
        // ListNode b = new ListNode(5);
        // ListNode c = new ListNode(4);
        // ListNode d = new ListNode(1);
        // ListNode e = new ListNode(2);
        // ListNode f = new ListNode(8);
        // ListNode g = new ListNode(10);
        // ListNode h = new ListNode(13);

        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(2);
        Node f = new Node(8);
        Node g = new Node(10);
        Node h = new Node(13);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h; //[3,5,4,1,2,8,10,13]

        // ListNode oddEven = splitEvenOddLinkedList(a);
        // while (oddEven != null) {
        //     System.out.print(oddEven.val+" ");
        //     oddEven = oddEven.next;
        // }

        Node newNode = divide(a);
        Node temp = newNode;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        } //4 2 8 10 3 5 1 13

    }
}
