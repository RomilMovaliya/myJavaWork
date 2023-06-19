public class subarraySum {

   public static void arraysum(int arr[],int s){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==s){
                   System.out.println(i+" "+j);
                    return;
                }
            }
        
    }
    return;
}
    public static void main(String[] args) {
        int arr[]={0,1,2,3,7,5};// you should always add 0 at index=0 
        int s=5;
        arraysum(arr,s);
        }
    }

