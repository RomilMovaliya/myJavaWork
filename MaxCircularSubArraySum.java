import java.lang.Math;
import java.util.*;
public class MaxCircularSubArraySum{
/*main logic is
    given                    [4,-4,6,-6,10,-11,12]
    covert -ve               [-(4),-(-4),-(6),-(-6),-(10),-(-11),-(12)]-->[-4,4,-6,6,-10,11,-12]
    using kadan algo and get the 11 max value then assign 0 value instead of 11

                            [-4,4,-6,6,-10,0,-12]
    again covert into -ve    [4,-4,6,-6,10,0,12]
    and again use kadan algo then we will get the ans=> 22
*/
  
  
  
  
  public static void diffAlgo(int arr[],int n) {
       int rm; // rm variable store remove value which we want to remove 
        for(int i=0;i<arr.length;i++){
            
            arr[i]=-arr[i];
            System.out.print(arr[i]+" ");
            
    }
    System.out.println();
    
    int currentsum=0;
    int maxsum=-1999999;
    for(int j=0;j<arr.length;j++){
        currentsum+=arr[j];
        if(currentsum<0){
            currentsum=0;
        }
        maxsum=Math.max(maxsum, currentsum);
         }
    rm=maxsum;
 
    for(int i=0;i<arr.length;i++){
        
        if(arr[i]==rm){
            arr[i]=0;
        }
        arr[i]=-arr[i];
        
        
}
     int newcurrentsum=0;
    int newmaxsum=-1999999;
    for(int j=0;j<arr.length;j++){
        newcurrentsum+=arr[j];
        if(newcurrentsum<0){
            newcurrentsum=0;
        }
        newmaxsum=Math.max(newmaxsum, newcurrentsum);
         }
         System.out.println(newmaxsum);
    
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        

        

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        diffAlgo(arr,n);
             
     }
}

