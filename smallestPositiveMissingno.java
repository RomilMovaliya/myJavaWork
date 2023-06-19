public class smallestPositiveMissingno {
    
    public static void missingNumber(int arr[],boolean check[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                check[arr[i]]=true;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(check[i]==false){
                System.out.println(i);
                return;
            }
        }
return;
    }
    public static void main(String[] args) {
        int arr[]={0,-9,1,2,-4,5};
        int n=arr.length;
        boolean check[]=new boolean[n];
        for(int i=0;i<n;i++){
            check[i]=false;
        }
        missingNumber(arr, check);
            }
}
