import java.util.Scanner;
public class maxNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Three Number Here : ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int w=sc.nextInt();

        if(m>n && m>w){
                System.out.println("The maximum number is : "+m);
            
        }else if(w>m && w>n){
                System.out.println("The maximum number is : "+w);
            
        }else{
            System.out.println("The maximum number is : "+n);
        }

    }    
}
