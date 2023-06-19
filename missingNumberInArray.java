public class missingNumberInArray {
    public static void missnum(int arr[]){
        boolean check[]={false,false,false,false,false,false};
        

        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                check[arr[i]]=true;
            }
        }
        int ans=-1;
        for(int i=1;i<check.length;i++){
            if(check[i]==false){
                ans=i;
                System.out.println(ans);
                
            }
        }
        return;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        missnum(arr);
        
    }
}
