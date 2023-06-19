import java.util.*;
public class postfixtoinfix {
    
    public static boolean operand(char c) {
        return (c>='a' && c<='z' || c<='A' && c>='Z');
    }
    public static String postfixtoinfix(String s) {
        Stack<String> st=new Stack<>();
       for(int i=0;i<s.length();i++){
        if (operand(s.charAt(i))) {
            st.push(s.charAt(i)+" ");
        }else{
            String op1=st.peek();
            st.pop();
            String op2=st.peek();
            st.pop();

            st.push("("+op2+ s.charAt(i) +op1+")");
        }
    
       }
       return st.peek();
        }
    public static void main(String[] args) {
        String s="abc++";
        System.out.println(postfixtoinfix(s));
        
    }
}
