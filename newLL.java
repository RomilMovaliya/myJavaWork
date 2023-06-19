import java.util.LinkedList;
public class newLL {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        LinkedList<String> list2=new LinkedList<String>();
        list2.add("Mircosoft Intern 2023");
        list2.addFirst("engage program");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i)+"->");
        }
        System.out.println("null");

        list.addFirst(" romil");
        list.addLast(" movaliya");
        list.addFirst("mr.");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("Null");

        list.add("devOps engineer");
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.addAll(list2);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.clear();
        
        System.out.print(list);
    }
}
