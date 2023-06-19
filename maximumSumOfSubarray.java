import java.lang.Math;
public class maximumSumOfSubarray{
    public static void main(String[] args) {
        int maximum=-199999;
        int arr[]={-1,4,7,2};
        int a[]=new int[12];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                a[i]=sum;
                //System.out.print(a[i] +" ");
            }
            maximum=Math.max(maximum, sum);
            
        }
        System.out.println("The maximum sum of a given subArray is : "+maximum);
    }
}