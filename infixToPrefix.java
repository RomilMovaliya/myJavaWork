import java.util.*;
import java.io.*;
public class infixToPrefix {
    
    
    
    public static int prec(char c){
        if(c=='^'){
            return 3;
        }else if(c=='*' && c=='/'){
            return 2;
        }else if(c=='+' && c=='-'){
            return 1;
        }else{
            return -1;
        }
    }


    public static String infixtopre(String s){
        String str=new String("");

        for (int i = 0; i < s.length(); i++) {
        char cr=s.charAt(i);
        str=str+cr;    
        }
        Stack<Character> st=new Stack<Character>();
        String result=new String("");

        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c >='a' && c<='z' || c>='A' && c<='Z'){
                result+=c;
            }else if(c=='('){
                st.push(c);
            }else if(c==')'){
                while (!st.isEmpty() && st.peek()!='(') {
                    result+=st.peek();
                    st.pop();
                }
                st.pop();
            }else{
                while (!st.empty() && prec(st.peek())>prec(c)) {
                    result+=st.peek();
                    st.pop();
                }
                st.push(c);
            }
         }
                while (!st.isEmpty()) {
                    result+=st.peek();
                    st.pop();
                }  
        
        return result;
    }


    
    
    public static void main(String[] args) {
        System.out.print(infixtopre("(a-b/c)*(a/k-l)"));
    }
}
/*
  */