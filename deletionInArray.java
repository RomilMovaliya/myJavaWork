public class deletionInArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int index=2;
        int n=arr.length;
        int newarr[]=new int[n-1];

        for(int i=0;i<n;i++){
            if(i<=index-1){
                newarr[i]=arr[i];
            }else if(i==index){
                continue;
            }else{
                newarr[i-1]=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }

    }
}
