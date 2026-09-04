import java.util.*;
public class dp {
    static int[] dp=new int[1000];
    static int ways(int n){
        if(n==1||n==2){ //base case
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=ways(n-1)+ways(n-2);//  ways(n-1)+ways(n-2)-transition
        return dp[n];  //dp[n]--is the state
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ways(n));
    }
        
}
