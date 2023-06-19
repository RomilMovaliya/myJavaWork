public class reverseNumber{
    public static void main(String[] args) {
        int n=1234;
        int reverse=0;
        while(n>0){
            int lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }
        System.out.println(reverse);
    }
}