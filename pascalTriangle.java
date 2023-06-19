public class pascalTriangle {
    public static int ncr(int m) {
        if(m==0 || m==1){
            return 1;
        }
        return m*ncr(m-1);
    }
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i)-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(ncr(i)/(ncr(j)*(ncr(i-j)))+" ");
            }
            System.out.println();
        }
    }
}
