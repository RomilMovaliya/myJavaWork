import java.util.*;
public class priorityQueue {
    

    
    
    public static void main(String[] args) {
    PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
    p.add(1);
    p.add(15);
    p.add(6);
    p.add(2);
    p.add(3);

    while (!p.isEmpty()) {
        System.out.println(p.peek());
        p.poll();
    }

    

    }
}
