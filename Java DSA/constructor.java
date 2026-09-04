// constructors-method name cls name and object name is same
//types parametrized and default
//default if we not give the same method name then it will auto. consider it as cons. and take
import java.util.*;
 class teacher{
    String name;
    int age;
    String subject;
     public void teacherInfo(){//deafutly it will take as teacher//method in side cls
        System.out.println(this.name);//this-refer the variable or attribute
        System.out.println(this.age);
        System.out.println(this.subject);
    }
 teacher()//non paramerterized constructor we have given
 {
    System.out.println("TEACHER CONSTRUCTOR CALLED");
    this.name = name;
    this.age = age;
    this.subject = subject;
 }
}
public class constructor {
    public static void main(String[] args) {
        teacher t1 = new teacher();//obj - t1-obg name
        t1.name = "Raja";
        t1.age = 12;
        t1.subject = "maths";
        t1.teacherInfo();//calling the method 
    }
}