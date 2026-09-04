import java.util.*;
public class digitscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int num=sc.nextInt();
        int count =0;
        if(num==0){
            count =1;
        }
        else{
        while(num !=0){
            num = num/10;//every time u div by 10 decimal point shifts 1234.5 where 5 is not taken coz of the dt being int
            count++;
        }
        }
    System.out.println("number of digits:"+count);
    }
}



