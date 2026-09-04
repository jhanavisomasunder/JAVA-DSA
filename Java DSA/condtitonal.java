//switch case problem and math cals using this
import java.util.*;
public class condtitonal {
    public static void main(String[]args){
        System.out.println("welcome to simple calculater program");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a");
        int a =sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the choice");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
                int sum =a+b;
                System.out.println("add"+sum);
                break;
            case 2:
                int sub =a-b;
                System.out.println("sub"+sub);
                break;
            case 3:
                int mul =a*b;
                System.out.println("mul"+mul);
                break;
            case 4:
                int div =a/b;
                System.out.println("div"+div);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        }

}
