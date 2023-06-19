public class firstRepeatingElement {
    
    public static void first(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]== arr[j]){
                    System.out.println(i);
                return;
                    
                }
                
            }
        }
    return;
    }
    
    
    public static void main(String[] args) {
        int arr[]={1,5,3,4,3,5,6};
        first(arr);
    
                    
        }
}
