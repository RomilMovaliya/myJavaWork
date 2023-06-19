import java.util.*;
public class prefixTopostfix {

    public static boolean operand(char c) {
        return (c>='a' && c<='z' || c>='A' && c<='Z');
    }

    public static String prefixtoinfix(String s) {
        Stack<String> st=new Stack<>();
        for (int i = s.length()-1; i>=0; i--) {
            if(operand(s.charAt(i))){
                st.push(s.charAt(i)+" ");
            }else{
                String op1=st.peek();
                st.pop();
                String op2=st.peek();
                st.pop();

                st.push("("+op1+s.charAt(i)+op2+")");
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s="*+AB-CD";
        System.out.println(prefixtoinfix(s));
    }
}
