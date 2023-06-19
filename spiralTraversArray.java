import java.util.*;
public class spiralTraversArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No of rows : ");
        int n=sc.nextInt();
        System.out.print("Enter the No of columns : ");
        int m=sc.nextInt();
        System.out.println("Enter the matrix elements : ");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        int row_end=n-1;
        int col_end=m-1;
        int i=0;
        int j=0;
        while(i<=row_end && j<=col_end){

        
        //first row
                for(int k=j;k<=row_end;k++){
                    System.out.print(arr[i][k]+" ");
                }
                i++;
                //end column
                for(int endcolumn=i;endcolumn<=col_end;endcolumn++){
                    System.out.print(arr[endcolumn][col_end]+" ");
                }
                col_end--;
                 //end row
                for(int endrow=col_end;endrow>=0;endrow--){
                    System.out.print(arr[row_end][endrow]+" ");
                }
                row_end--;
                //first column
                for(int firstcol=row_end;firstcol>=i;firstcol--){
                    System.out.print(arr[firstcol][j]+" ");
                }
                j++;
                

                
        }
        }
    }

