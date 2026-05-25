package Queue;

public class CircularQueueArray {

    public static class CircularQArray
    {
        int f=-1; //front
        int r=-1;  //rear
        int size=0;
        int[] arr = new int[5];

        public void add(int val) throws Exception
        {
            if(size == arr.length)
            {
                throw new Exception("Queue is full");
            }
            else if(size == 0)
            {
                f=r=0;
                arr[0] = val;
            }
            else if(r<arr.length-1) //normal case
            {
                arr[++r] = val;
            }else if(r == arr.length-1)
            {
                r=0;
                arr[0]=val;
            }
            size++;
        }

        public int remove() throws Exception
        {
            if(size == 0)
            {
                throw new Exception("Queue is full");
            }else{
               int val = arr[f];
               if(f==arr.length-1) f=0;
               else f++;
               size--;
               return val;
            }
        }

        public int peek() throws Exception
        {
            if(size == 0)
            {
                throw new Exception("Queue is full");
            }
            return arr[f];
        }

        public boolean isEmpty()
        {
            if(size == 0) return true;
            return false;
        }

        public void display()
        {
            if(size == 0)
            {
                System.out.println("Queue is empty");
            }
            else if(f<=r)
            {
                for(int i=f; i<=r; i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }else //r<f
            {
                for(int i=f; i<arr.length; i++)
                {
                    System.out.print(arr[i]+" ");
                }
                for(int i=0; i<=r; i++)
                {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }

   public static void main(String[] args) throws Exception {
        CircularQArray cq = new CircularQArray();
        cq.display(); //Queue is empty
        System.out.println(cq.isEmpty()); //true
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.display(); // 1 2 3 4 
        cq.remove();
        cq.display(); // 2 3 4 
        cq.add(5);
        cq.display(); // 2 3 4 5
        cq.add(6);
        cq.display(); //  6 2 3 4 5   -> 2 3 4 5 6

        for(int i=0; i<cq.arr.length; i++)
        {
            System.out.print(cq.arr[i]+" ");

        }
        System.out.println();
        System.out.println(cq.peek()); //2
        System.out.println(cq.isEmpty()); //false
        //cq.add(7);  // Exception: Queue is full
   }
}
