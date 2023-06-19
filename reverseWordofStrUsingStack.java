import java.util.*;
public class reverseWordofStrUsingStack {

    public static void reverseStr(String s) {
        Stack<String> st=new Stack<String>();
        String result=" ";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                st.push(result);
            }
            result=result+s.charAt(i);
        }
        st.push(result);

        while (!st.isEmpty()) {
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
    public static void main(String[] args) {
        reverseStr("romil is my brother");
    }
}
