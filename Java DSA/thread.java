//SINGLE THREAD
class mythread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println(" Child Thread "+i);
        }
    }
}
public class thread{
    public static void main(String[] args) {
    mythread t1 = new mythread();
    t1.start();// no start method but also thread running--starting this thread--- start method is used to start the thread and it will call the run method internally
    //t1.run();---calling run method--- directly the thread run 
    for(int i=0;i<5;i++){
        System.out.println(" Main Thread "+i);
        }
    }
}
//output will be differnt every time we run coz of cpu schenduling which thread is taking less time to execute will come 1st everytime it might be diff.