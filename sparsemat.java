import java.util.*;
    public class sparsemat{
    
        public static void main(String[] args) {
        
            Scanner sc=new Scanner(System.in);
            int row=sc.nextInt();
            int col=sc.nextInt();
            int arr[][]=new int[row][col];
        
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                   arr[i][j]=sc.nextInt(); 
                }
    
            }		
            int size=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                  if(arr[i][j]!=0){
                      size++;
                  }
                 
                }
    
            }	
            System.out.println();
            int newarr[][]=new int[3][size];
            int k=0;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(arr[i][j]!=0){
                  newarr[0][k]=i;
                  newarr[1][k]=j;
                  newarr[2][k]=arr[i][j];
                 k++;      
                    }
                  
                 
                }
    
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<size;j++){
                  System.out.print(newarr[i][j]+" ");
                 
                }
                System.out.println();
    
            }	
            
            
    
                    
            
            
            
        }
    }
    
       

