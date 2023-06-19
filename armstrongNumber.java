import java.lang.Math;
public class armstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        int originaln=n;
        while(n>0){
            int lastdigit=n%10;
            sum +=Math.pow(lastdigit,3);
            n=n/10;

        }if(sum == originaln){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
