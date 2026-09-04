//searching an elemnt in 2d array
import java.util.*;
public class array2d1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row");
        int row =sc.nextInt();
        System.out.println("enter column");
        int col =sc.nextInt();
         int arr[][]= new int[row] [col];
         System.out.println("enter the target element :");
        int target=sc.nextInt();
        System.out.println("enter the elemnts ");
        //take the ip from user
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // to print the no.s in matrix this lop is used
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println(" ");
        }
        //to find the elemnt in 2d arry
        boolean found=false;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==target){
                    System.out.print("row:"+i+"col:"+j);
                    found = true;
                    break;
                }
            }
        }//out of loop for not found
                if (!found) {
            System.out.println("Element not found in the array.");
        }
    
}
}
