//name : Movaliya Romil Rajeshbhai
//enrollment no. 202103103510247
//class : cse-c1(division -A)
//program : 8

import java.util.Scanner;
public class linearSearch{
    public static int LinearSearch(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(key == arr[i]){
                return i;
            }
            
        }
            return -1;
            
    }
    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number which you want to find index : ");
        int key=sc.nextInt();
        int n=arr.length;
        System.out.println( LinearSearch(arr,n,key));
        
    }
}