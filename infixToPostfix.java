import java.util.Stack;
public class infixToPostfix {
    
    public static int prec(char c){
        if(c=='^'){
            return 3;
        }
        else if(c=='*' || c=='/'){
            return 2;
        }
        else if(c=='+'|| c=='-'){
            return 1;
        }else{
            return -1;
        }
    }

    public static String infixtopost(String s){
        Stack<Character> st=new Stack<Character>();
        String res=new String("");

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z' || c>='A' && c<='Z'){
                res+=c;
            }else if(c=='('){
                st.push(c);
            }else if(c==')'){
                while (!st.isEmpty() && st.peek()!='(') {
                    res+=st.peek();
                    st.pop();
                }
               st.pop();
            }
            else{
                while (!st.empty() && prec(st.peek())>prec(c)) {
                    res+=st.peek();
                    st.pop();
                    
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            res+=st.peek();
            st.pop();
        }
        return res;
    }
    
    
    
    public static void main(String[] args) {
     System.out.println(infixtopost("(a-b/c)*(a/k-l)"));   
    }
}
