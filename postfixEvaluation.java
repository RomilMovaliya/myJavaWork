import java.util.Stack;
public class postfixEvaluation {

    public static int postfixEvalu(String s) {
        Stack<Integer> st=new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                st.push(c-'0');

            }else{
                int op2=st.pop();
                int op1=st.pop();
                

                switch (c) {
                    case '+':
                        st.push(op1+op2);
                        break;
                
                    case '*':
                    st.push(op1*op2);
                    break;
                    
                    case '/':
                        st.push(op1/op2);
                        break;
                        
                    case '-':
                    st.push(op1-op2);
                    break;
                    
                    }
            }
            
        }
        return st.pop();
    
    }
    public static void main(String[] args) {
        String s="46+2/5*7+";
           System.out.println( postfixEvalu(s));
    }
}
