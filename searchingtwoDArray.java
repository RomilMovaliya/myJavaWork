import java.util.*;
public class searchingtwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        System.out.print("Enter The Number Which you wannt to Find index : ");
        int key=sc.nextInt();
        int arr1[][]=new int[row][column];
        int arr2[][]=new int[row][column];
        int arr3[][]=new int[row][column];
        

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                 arr3[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr3[i][j]==key){
                    System.out.println(i +" "+j);
                }
                 
            }
            System.out.println();
        }
    
    }
}
