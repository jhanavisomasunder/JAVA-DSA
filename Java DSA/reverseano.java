import java.util.*;
public class reverseano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num");
        int num=sc.nextInt();
        int reverse=0;
        while( num!=0){
            int digit = num%10; //the last didgit only ie 5 which will be stored as digit
            reverse = reverse*10+digit;//0*10+5 and for next 5*10+4=54
            num=num/10;
 // to remove the last digit ie 5 foreg in 1234.5 for the next digit        
        }
        System.out.println("reverse ="+reverse);
    }
}