class mythread extends Thread{
    String name;
    mythread(String name){
    this.name = name;
    }
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println( name+" "+i);
        //sleep for 1000ms-1s
        try{
            Thread.Sleep(millis:1000);
        }catch(Exception e){
            System.out.println(e);
        }
        }
    }
}
public class Thread3{
    public static void main(String[] args) {
    mythread t1 = new mythread( "music");
    mythread t2 = new mythread( "Dance");
    mythread t3 = new mythread( "Audio");
    t1.start();// no start method but also thread running--starting this thread--- start method is used to start the thread and it will call the run method internally
    t2.start();
    t3.start();
    //t1.run();---calling run method--- directly the thread run 
        }
    }