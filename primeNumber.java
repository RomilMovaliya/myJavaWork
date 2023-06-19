import java.util.*;
public class primeNumber {
    public static int primeNumber(int n) {
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i%j)==0){
                    return i;
                }
            }
            
            
        }
        
        
        return -1;
        
        
        
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(primeNumber(n));
        }
    }

