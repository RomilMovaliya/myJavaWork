import java.util.*;
public class matrixTransmission {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
            
        }
    
    System.out.println();
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            
            System.out.print(a[j][i]+" ");
        }
        System.out.println();
    }
}
}
