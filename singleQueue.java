public class singleQueue {
    public static class queueY{
        static int size;
        static int arr[];
        static int rear=-1;
        static int front;


        queueY(int size){
            arr=new int[size];
            this.size=size;
        }

        public static boolean isempty(){
            return rear==-1;
        }
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public static int peek(){
            if(isempty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
            
        }
        public static int remove(){
            if(isempty()){
                System.out.println("queue is empty");
                return -1;
            }
            front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
    }
    public static void main(String[] args) {
        queueY q=new queueY(20);
        q.add(1);
        q.add(2);
        q.add(3);
        
        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
