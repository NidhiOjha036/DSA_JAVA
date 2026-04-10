package LinkedList;

public class implementation {

     public static class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;

        void insertAtHead(int val)
        {
            Node temp = new Node(val);
            if(head == null)
            {
                //head = tail = temp;
                insertAtEnd(val);
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtEnd(int val)
        {
            Node temp = new Node(val);
            if(head == null)
            {
                head=temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void display()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        // int size()
        // {
        //     Node temp = head;
        //     int count=0;
        //     while(temp != null)
        //     {
        //         count++;
        //         temp = temp.next;
        //     }
        //     return count;
        // }

        void insertAt(int idx, int val)
        {
            Node t = new Node(val);
            Node temp = head;
            if(idx == size)
            {
                insertAtEnd(val);
                return;
            }else if(idx==0)
            {
                insertAtHead(val);
                return;
            }else if(idx<0 || idx>size)
            {
                System.out.println("wrong index");
                return;
            }
            for(int i=1; i<=idx-1;i++)
            {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx)
        {
            Node temp = head;
            if(idx<0 || idx>size)
            {
                System.out.println("wrong index");
                return -1;
            }
            for(int i=1; i<=idx; i++)
            {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx)
        {
            if(idx==0) {
                head = head.next;
                size--;
                return;
            }
            Node temp = head;
            for(int i=1; i<=idx-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == size-1) tail=temp;
            size--;
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(4);
       // ll.display();
        ll.insertAtEnd(5);
        //ll.display();
        ll.insertAtHead(13);
        //ll.display();
        ll.insertAt(3, 10);
        //ll.display();
        System.out.println(ll.tail.data);
        ll.insertAt(0, 100);
        ll.display();
        //System.out.println("Size: "+ll.size());
        System.out.println("Get: "+ll.getAt(4));
        
        ll.deleteAt(0);
        ll.display();

        System.out.println("Size "+ll.size);
    }
}
