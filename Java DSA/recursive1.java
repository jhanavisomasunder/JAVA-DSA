 public class recursive1 {
    static int fact(int n){ 
        if(n<0){
            return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
        
    }
    public static void main(String[] args){
        int n=1;
        int factorial=fact(n);
        if(fact(n)==-1){
            System.out.println("no factorial");
        }
        else{
        System.out.println("factorial "+factorial);
        }
    }
} 
    

