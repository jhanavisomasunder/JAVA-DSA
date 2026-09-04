// 2D array of 4 rows 5 col the the sixe for int is 4*5*4bytes(each int is of 4 bytes)= 80bytes
import java.util.*;
public class array2d{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row");
        int row =sc.nextInt();
        System.out.println("enter column");
        int col =sc.nextInt();
         int arr[][]= new int[row] [col];
        System.out.println("enter the elemnts ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+"\t");// print the elemnt on the same line
            }// "\t" space between elemnts
            System.out.println(" ");// to get in the form of matrix in side 1 loop
        }
       
    }
}