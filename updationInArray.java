public class updationInArray {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int n=arr.length;
    int value=8;
    int index=3;
    int newarr[]=new int[n];

    for(int i=0;i<n;i++){
        if(i<=index-1){
            newarr[i]=arr[i];
        }
        else if(i==index){
            newarr[i]=value;
        }
        else{
            newarr[i]=arr[i];
        }
    }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    for (int i = 0; i < newarr.length; i++) {
        System.out.print(newarr[i]+" ");
    }
    }

}
