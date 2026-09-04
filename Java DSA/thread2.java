//multithread
class mythread extends Thread{
    public void run(){
        System.out.println("ONE THREAD");
    }
}
class mythread2 extends Thread{
    public void run(){
        System.out.println("Two THread");
    }
}

public class thread2 {
    public static void main(String[] args) {
        mythread t1 =  new mythread();
        t1.start();
        mythread2 t2 = new mythread2();
        t2.start();
    }
}
