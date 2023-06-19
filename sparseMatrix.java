//name : Movaliya Romil Rajeshbhai
//enrollment no. 202103103510247
//class : cse-c1(division -A)
//program : 2
import java.util.*;;
public class sparseMatrix {

    public static void main(String[] args) {
        
    
    ArrayList<Integer> list=new ArrayList<Integer>();
    System.out.println("program 1");
    //add 
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    
    //delete
    list.remove(1);
    System.out.println(list);

    //update-set
    list.set(2,8);
    System.out.println(list);
    
    //iterate-search
    for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
    }
    System.out.println();

    }
}
