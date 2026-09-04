import java.util.*;
public class patterns7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
        for(int j=1;j<=2*i-1;j++){//for odd no. of *
            System.out.print("*");
        }
        System.out.println();
    }
    }
}