//SMART STUDENT RESULT AND PERFORMANCE ANALYZER
/*ADD STDENTS(ROLLNO. name , 4 sub marks)
DISPLAY ALL STUDENTS,ANALYZE RESULTS(topper,lower with total name avg roll no.)
,FIND TOPPER,SEARCH STUDENT(array traversal)
,ANALYZE TEST PERFORMANCE,FIND STUDENT PAIR 
TwO POINTER SUB1 AND SUB2 AND TARGET,sliding window,recursion
*/
import java.util.*;
//add student
public class Miniproject {
    Scanner sc= new Scanner(System.in);
    int []roll =new int[8];
    String[] name= new String[8];
    int [] m1=new int[8];
    int [] m2=new int[8];
    int [] m3=new int[8];
    int [] m4=new int[8];
    public void addStudents(){
        System.out.println("STUDENT DETAILS");
        System.out.println("add student roll number");
        for(int i=0;i<8;i++){
            roll[i]=sc.nextInt();
        }
        System.out.println("add student name");
        for(int i=0;i<8;i++){
            name[i]=sc.next();
        }
        System.out.println("add student marks 1");
        for(int i=0;i<8;i++){
            m1[i]=sc.nextInt();
        }
        System.out.println("add student marks 2");
        for(int i=0;i<8;i++){
            m2[i]=sc.nextInt();
        }
        System.out.println("add student marks 3");
        for(int i=0;i<8;i++){
            m3[i]=sc.nextInt();
        }
        System.out.println("add student marks 4");
        for(int i=0;i<8;i++){
            m4[i]=sc.nextInt();
        }
    }
// display student
 public void displaystudent(){
    System.out.println("ROLL NO.\tNAME\t\tMATH\tCHEM\tPHY\tBIO");
    System.out.println("-------------------------------------------------------------");

    for (int i = 0; i < 8; i++) {
        System.out.println(roll[i] + "\t\t" + name[i] + "\t\t" + m1[i] + "\t" + m2[i] + "\t" + m3[i] + "\t" + m4[i]);
    }
}
// analyse results
public void analyseResults() {
    int topper = 0;
    int lower = 0;
    int[] total = new int[8];

// calculate total marks for each student
    for (int i = 0; i < 8; i++) {
        total[i] = m1[i] + m2[i] + m3[i] + m4[i];
        if (total[i] > total[topper]) {
            topper = i;
        }
        if (total[i] < total[lower]) {
            lower = i;
        }
    }

    System.out.println("\nRESULT ANALYSIS");
    System.out.println("Topper: Roll No " + roll[topper] + ", Name: " + name[topper] + ", Total Marks: " + total[topper]);
    System.out.println("Lowest: Roll No " + roll[lower] + ", Name: " + name[lower] + ", Total Marks: " + total[lower]);
}
//Search student by their roll number
// search student by roll number
public void searchStudent(int targetRoll) {
    boolean found = false;

    for (int i = 0; i < 8; i++) {
        if (roll[i] == targetRoll) {
            int total = m1[i] + m2[i] + m3[i] + m4[i];// for finding the total for the given roll no. student to print 
            System.out.println("\nSTUDENT FOUND:");
            System.out.println("Roll No: " + roll[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Math: " + m1[i]);
            System.out.println("Chemistry: " + m2[i]);
            System.out.println("Physics: " + m3[i]);
            System.out.println("Biology: " + m4[i]);
            System.out.println("Total Marks: " + total);
            found = true;
            break; // stop once we find the student
        }
    }

    if (!found) {
        System.out.println("\nStudent not found");
    }
}

public static void main(String[] args) {
    Miniproject a1=new Miniproject();
    a1.addStudents();
    a1.displaystudent();
    a1.analyseResults();
    System.out.println("\nEnter roll number to search:");
    int target = a1.sc.nextInt();
    a1.searchStudent(target);
}
}

   