import java.lang.Thread;

class mythread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("hello i am first thread ");
        
        }
       
    }
}
class mythread2 extends Thread{
    public void run(){
        while (true) {
            System.out.println("hello i am second thread !!!");
        }
       
    }
}


public class Thread {
public static void main(String[] args) {
    mythread1 t1=new mythread1();
    mythread2 t2=new mythread2();
    t1.start();
    t2.start();
}
    
}