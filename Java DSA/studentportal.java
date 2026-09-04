import java.util.*;
public class studentportal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Person:");
        String name=sc.nextline();
        System.out.println("enter the marks of 1st subject:");
        int a = sc.nextInt();
        System.out.println("enter the marks of 2nd subject:");
        int b = sc.nextInt();
        System.out.println("enter the marks of 3rd subject:");
        int c = sc.nextInt();  
    //the choice should be put again and again so we put sop of choice in do wile loop
    //in do while we have to put the switch case coz the switch should loop again for other choices it should not come out after 1 case
       do {
         System.out.println("enter the choice ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                totalmarks = totalmarks(a,b,c);
                System.out.println("cal the toal marks:"+totalmarks);
                break;
            case 2:
                percentage =percentage(a,b,c);
                System.out.println("Get percentage:"+percentage);
                break;
            case 3:
                status=isfail(percentage);
                System.out.println("is the student isfail:"+isfail);
                break;
            case 4:

                System.out.println("display the overall result:");
                break;
            default:
                System.out.println("invalid choice");
                break;
        } while( choice)
        //creating differnt functions for each cases to get calculated for each case we can put the void or int return type 
        static void total(sum){

        }
       }








}






    }

    
}
