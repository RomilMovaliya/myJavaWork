public class recordBreak{
    public static void main(String[] args) {
        int arr[]={1,2,0,7,2,0,2,2};
        //int arr[]={3,1,4,1,5,9,2,6,5};
        int n=arr.length;
        int days=0;
        if(arr[0]>arr[1]){
            days+=1;
            System.out.println("index for those days : "+0);

        }
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                days+=1;
                System.out.println("index for those days : "+i +" ");
            }
        }
        
        System.out.println("no. of days : "+days);
    }
}