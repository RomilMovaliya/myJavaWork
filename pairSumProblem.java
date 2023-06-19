public class pairSumProblem {
    public static void main(String[] args) {
        int arr[]={2,4,7,11,14,16,20,21};
        int k=31;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(i +" "+ j);
                }
            }
        }
    }
}
