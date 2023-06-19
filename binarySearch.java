//name : Movaliya Romil Rajeshbhai
//enrollment no. 202103103510247
//class : cse-c1(division -A)
//program : 8

import java.util.*;
public class binarySearch {
    public static int binarySearch(int arr[],int n,int key) {
        int s=0;
        int e=n;
        while (s<=n) {
            int mid=(s+e)/2;
         
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                e=mid-1;
            }else{
                s=mid+1;
            }
           
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,20};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number which you find the index : ");
        int key=sc.nextInt();
        
        System.out.println(binarySearch(arr,n,key));
    }
}
