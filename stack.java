//name : Movaliya Romil Rajeshbhai
//enrollment no. 202103103510247
//class : cse-c1(division -A)
//program : 3


//implement stack using array
public class stack {
        static int top;
        static int n = 20;
        static int arr[] = new int[n];
        static int size=0;
    
        stack() {
            top = -1;
        }
    
        public void push(int x) {
            if (top == n - 1) {
                System.out.println("stack is overflow");
                return;
            }
            top++;
            size++;
            arr[top] = x;
    
        }
    
        public void pop() {
            if (isempty()) {
                System.out.println("stack is empty");
                return;
            }
            top--;
            size--;
            
        }
    
        public int size(){
            return size;
        }
    
        public int get() {
            if (top == -1) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[top];
        }
    
        public boolean isempty(){
            return (top==-1);
        }
    
        public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.get());
        System.out.println(st.size());
        st.pop();
        st.pop();
        System.out.println(st.get());
        System.out.println(st.size());
        System.out.println(st.isempty());
        st.pop();
        st.pop();
        System.out.println(st.isempty());

    }

        public void add(int i) {
        }
}
