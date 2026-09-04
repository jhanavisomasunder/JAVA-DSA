
 class teacher{
    String name;
    int age;
    String subject;
    teacher(String name,int age,String subject){//paramerterized constructor we have given
    this.name = name;
    this.age = age;
    this.subject = subject;
 }
     public void teacherInfo(){//deafutly it will take as teacher//method in side cls
        System.out.println(this.name);//this-refer the variable or attribute
        System.out.println(this.age);
        System.out.println(this.subject);
    }
}
public class constructor3 {
    public static void main(String[] args) {
        teacher t1 = new teacher("jamuna",24,"gymnastic");//obj - t1-obg name
        t1.teacherInfo();
    }  
}
