package Queue;

public class CircularLLImpQueue {

    public static class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val = val;
        }
    }

    public static class LLCircularQueue{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val)
        {
            Node temp = new Node(val);
            if(head == null)
            {
                head = tail = temp;
                tail.next = head;
            }else{
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
            size++;
        }

        int remove() throws Exception
        {
            if(size == 0){
                throw new Exception("Queue is empty");
            }
            int val = head.val;
            if(size == 1){
                head = tail = null;
            }else{
                head = head.next;
                tail.next = head;
            }
            size--;
            return val;
        }

        int peek() throws Exception
        {
           if(size == 0){
                throw new Exception("Queue is empty");
            }
            return head.val;
        }

        public void display()
        {
            if(size == 0)
            {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            do{
            System.out.print(temp.val + " ");
            temp = temp.next;
            }while(temp != head);
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        LLCircularQueue q = new LLCircularQueue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        q.remove();
        q.display();
        q.add(5);
        q.display();
    }

}
