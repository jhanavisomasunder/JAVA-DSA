//import java.util.Scanner; //sc is the object for scnner
class Student{//no static-coz it is used only when we create the object for the cls. and public 
    String name;//attributes or parameters of the cls
    int age;
    int marks;
//void main()-no return type ,int add()-there is return type
void study(){//fun defined under a class and they r know as methods 
    System.out.println(name+"is studying");
}
void takeexam(){//fun defined under a class and they r know as methods 
    System.out.println(name+"is taking exam");
}
void display(){
System.out.println("name="+name);
System.out.println("marks="+marks);
System.out.println("age:"+age);
}
}
//scanner is a predefined cls-
//object is created in the main file
public class oops{
    public static void main(String[] args) {
        System.out.println("welcome");
        //Scanner sc = new Scanner(System.in);
        Student student1 = new Student();
        Student student2 = new Student();
        student1.name ="bhemm";//obect 1
        student1.age = 7;
        student1.marks = 20;
        student1.study();
        student1.display();
        student2.name ="bh";
        student2.age = 3;//object 2
        student2.marks = 21;
        student2.study();
        student2.display();
        //by 1 cls we can create multiple obgs
//student1 is object for the cls student
    }
}