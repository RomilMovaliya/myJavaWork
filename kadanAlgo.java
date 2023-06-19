import java.util.*;
import java.lang.Math;
public class kadanAlgo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            
            arr[i]=sc.nextInt();
            
        }

        int currentsum=0;
        int maxsum=-1999999;
        for(int i=0;i<arr.length;i++){
            currentsum+=arr[i];
            if(currentsum<0){
                currentsum=0;
            }
            maxsum=Math.max(maxsum, currentsum);
        }
        System.out.print(maxsum);
    }
}
