import java.util.*;
public class reverseStringinStack{
    
    
    public static void reverseStr(String s){
    Stack<Character> st=new Stack<Character>();
    String result;

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            char c=s.charAt(i);
            st.push(c);
        }
        else{
            char c2=s.charAt(i);
            st.push(c2);
        }
    }

    while(!st.empty()){
        System.out.print(st.peek());
        st.pop();
    }


    }
    

    
    public static void main(String[] args) {
        reverseStr("my name is romil movaliya");
    }
}