//calculation using if else
import java.util.*;
public class ifelse {
    public static void main(String[]args){
        System.out.println("welcome to simple calculater program");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a");
        int a =sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the choice");
        int choice=sc.nextInt();
        if (choice==1){
            System.out.println(a+b);
        }
        else if (choice==2){
            System.out.println(a-b);
        }
        else if (choice==3){
            System.out.println(a*b);
        }
        else if (choice==4){
            System.out.println(a/b);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
