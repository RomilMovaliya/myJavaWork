// Name = Movaliya Romil Rajeshbhai 
// Enrollment no. 202103103510247
// Roll no. 25
// Practical no. 4 -- simple Queue
// Time complexity for insertion --> o(1)
// Time complexity for search    --> o(1)
// Time complexity for deletion  --> o(n) 


public class simpleQueue {
    static class queue{
        static int size;
        static int arr[];
        static int front;
        static int rear=-1;

        queue(int size){
            arr=new int[size];
            this.size=size;
        }

    
    public static void add(int data){
        if(rear==size-1){
           System.out.println("queue is full");
           return; 
        }
        rear++;
        arr[rear]=data;

    }

    public static int reomve(){
        if(rear==-1){
            System.out.println("queue is empty");
            return -1;
        }
        front=arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }


    public static int peek() {
        if(rear==-1){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[0];
    }
}
    public static void main(String[] args) {
        queue q=new queue(25);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        q.reomve();
        System.out.println(q.peek());
        
    }
}
