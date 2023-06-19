class pascalpettern{

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return factorial(n)*factorial(n-1);
        }
        
    }
    
    
     public static void main(String[] args) {
        int n=5;
        
        // this is outer loop for rows
        for(int i=0;i<n;i++){
            //inner loop for space
            for(int j=0;j<n-i;j++){
                System.out.println(" ");
            }
            for(int j=0;j<n;j++){
                System.out.println((factorial(i)/factorial(i-j)*factorial(j))+" ");
            }
            System.out.println();
        }
    }
}
