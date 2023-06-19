import java.util.Stack;
public class prefixEvalution {
    public static int prefixEvalu(String s) {
    
    Stack<Integer> st=new Stack<Integer>();
    for(int i=s.length()-1 ; i>=0 ; i--){
        char c=s.charAt(i);
        if(c>='0' && c<='9'){
            st.push(c-'0');
        }else{
            int op1=st.pop();
            int op2=st.pop();
           
            switch (c) {
                    
                    case '+':
                    st.push(op1+op2);
                    break;
                
                    case '-':
                    st.push(op1-op2);
                    break;
                
                    case '*':
                    st.push(op1*op2);
                    break;
                
                    case '/':
                    st.push(op1/op2);
                    break;
                   
            }

        }
    }
    return st.pop();
}
    public static void main(String[] args) {
        String s="-+7*45+20";
        System.out.println(prefixEvalu(s));
        
    }
}
