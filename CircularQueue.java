//some issue is there so .....
public class CircularQueue {
   
    public static class cqueue{
        static int size;
        static int arr[];
        static int front;
        static int result;
        static int rear=-1;

        cqueue(int size){
            arr=new int[size];
            this.size=size;
        }
        
        public static boolean isempty(){
            return rear==-1 && front==-1;
        }

        public static boolean isfull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isfull()){
                System.out.println("queue is full");
                return;
            }
            //1st element add
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        public static int remove(){
            if(isempty()){
                System.out.println("queue is empty");
                return -1;
            }
            result=arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isempty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        cqueue q=new cqueue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.peek());
        q.remove();
        q.add(5);
        System.out.println(q.peek());


   } 
}
