package LinkedList.SinglyLinkedList;

public class IntersectionLinkedList {

    static class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }

    static int length(Node head)
    {
        int length=0;
        while(head != null)
        {
            length++;
            head = head.next;
        }
        return length;
    }


    static Node getIntersectionNode(Node headA, Node headB)
    {
        
        int lengthA = length(headA);
        int lengthB = length(headB);

        Node tempA = headA;
        Node tempB = headB;

        if(lengthA > lengthB)
        {
            int steps = lengthA - lengthB;
            for(int i=1; i<=steps; i++)
            {
                tempA = tempA.next;
            }

        }else{
            int steps = lengthB - lengthA;
            for(int i=1; i<=steps; i++)
            {
                tempB = tempB.next;
            }
        }

        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
            if (tempA == null || tempB == null) return null;
        }
        return tempA;
    }

    public static void main(String[] args) {

        Node c1 = new Node(8);
        Node d1 = new Node(4);
        Node e1 = new Node(5);

        // First list
        Node a1 = new Node(4);
        Node b1 = new Node(1);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;

        // Second list
        Node a2 = new Node(5);
        Node b2 = new Node(6);
        Node c2 = new Node(1);
        a2.next = b2;
        b2.next = c2;

        // 👇 THIS IS THE KEY (intersection)
        c2.next = c1;

        Node intersectedNode = getIntersectionNode(a1,a2);
        if (intersectedNode != null)
        System.out.println("Intersected At " + intersectedNode.data);
        else
        System.out.println("No Intersection");
        

    }

}
