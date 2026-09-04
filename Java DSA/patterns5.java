import java.util.*;
public class patterns5 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
        for(int j=1;j<=i;j++){
            System.out.print("* ");// after star 1 space u get pyramid and before and after also space u get more spaced pyramid
        }
        System.out.println();
    }
    }
}