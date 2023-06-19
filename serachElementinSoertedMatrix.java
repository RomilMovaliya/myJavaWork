import java.util.*;
public class serachElementinSoertedMatrix {
    public static int search(int arr[][],int n1,int n2,int key) {
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr[i][j]==key){
                    System.out.println(i+" "+j);
                    return 0;
                }
            }
        }
    
        return -1;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int key=sc.nextInt();
    int arr[][]=new int[n1][n2];

    for(int i=0;i<n1;i++){
        for(int j=0;j<n2;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    search(arr, n1, n2, key);
    }
}
