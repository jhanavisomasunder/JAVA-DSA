import java.util.*;
public class pattern9diamond {
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
    for(int i=4;i>=1;i--){// there r 4 rows so i=4
            for(int j=1;j<=5-i;j++){//but the col is 5 only so j 1 to 5 
                System.out.print(" ");
            }
        for(int j=1;j<=2*i-1;j++){//for odd no. of *
            System.out.print("*");
        }
        System.out.println();
    }
    }
} 
