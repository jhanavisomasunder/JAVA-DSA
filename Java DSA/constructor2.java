import java.util.*;
 class teacher{
    String name;
    int age;
    String subject;
     //public void teacherInfo()
 teacher(String name,int age,String subject){//parameters are given // we can put in the constuctor only instead of method
    System.out.println("TEACHER CONSTRUCTOR CALLED");
    this.name = name;
    this.age = age;
    this.subject = subject;
    System.out.println(this.name);//this-refer the variable or attribute
    System.out.println(this.age);
    System.out.println(this.subject);
 }
}
public class constructor2 {
    public static void main(String[] args) {
        teacher t1 = new teacher("jamuna",24,"gymnastic");
    }
}
        //obj - t1-obg name
        // t1.name = "Raja";
        // t1.age = 12; // not given in parametrized as it is directly given in obej
        // t1.subject = "maths";
        //t1.teacherInfo();//calling the method 
    
