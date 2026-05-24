package Queue;

public class LLImplementationQueue {

    public static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
        }
    }

    public static class QueueLL {
         Node head = null;
         Node tail = null;
         int size = 0;
         
         void add(int val)
         {
            Node temp = new Node(val);
            if(size == 0)
            {
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
         }

         int peek()
         {
            if(size == 0)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
         }

         int remove()
         {
            if(size == 0)
            {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
         }

         void display()
         {
            Node temp = head;

            if(size == 0)
            {
                System.out.println("Queue is empty");
                return;
            }

            while (temp != null) {
               System.out.print(temp.val+" "); 
               temp = temp.next;
            }
            System.out.println();
         }

         boolean isEmpty()
         {
            if(size == 0) return true;
            return false;
         }
    }

    public static void main(String[] args) {
        QueueLL q1 = new QueueLL();
        System.out.println(q1.isEmpty()); //true
        q1.display(); //Queue is empty
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.display(); //1 2 3 4 
        System.out.println(q1.peek()); //1
        q1.remove();
        q1.display(); //2 3 4 
        System.out.println(q1.size); //3
        System.out.println(q1.isEmpty()); //false
    }
}
