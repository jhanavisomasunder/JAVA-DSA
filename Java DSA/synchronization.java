class bank{
    private int balance=10000;
    synchronized void withdraw(int amount){
        if(balance>=amount){
            System.out.println("withdraw: "+amount);
            balance -= amount;
            System.out.println("Remaining balance"+balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }

}
class user extends Thread{
    bank account;
    user(bank account){
        this.account=account;
    }
    public void run(){
        account.withdraw(800);
    }
}
public class synchronization{
    public static void main(String[] args) {
        bank account = new bank();
        user u1 = new user(account);
        user u2 = new user(account);
        u1.start();// we have 2 methods so it runs 2 times so it withdraws 2 times
        u2.start();
    }
}
//how many user we have given if the money which had to de withdrwan is there in the remaining balance accordinglr i will be withdrwan
//eg balance 10000--withdrw 800 reamain-9200, we have 2 users so agin 800 will be withdrawn 
//balance 1000 withdrwa 800 balance 200 again it wont withdrw as there is no amt to withdraw so 