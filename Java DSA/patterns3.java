import java.util.*;
public class patterns3 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){ //row
            for(int j=1;j<=10;j++){ //col
                if(i==1){
                    System.out.print(j+" "); //j will be changing i will be same
                }
                else if(j==1){
                    System.out.print(i+" "); //i will be changing j will be same
                }
            }
            System.out.println(); 
        }
    }
}    

