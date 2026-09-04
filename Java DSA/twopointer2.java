import java.util.*;
public class twopointer2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the  length of array:");
        int size=sc.nextInt();//intialization of length
         System.out.println("enter the  array:");
        int arr[]=new int[size]; //declaration of array 
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=arr.length-1;
        System.out.println("enter the target element:");
        int target=sc.nextInt();
        while(left<right){
            //until whent he loop should do the condition
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println(arr[left]+" "+arr[right]);//to konw which element found the target getting the sum
                break;
            }
            else if(sum<target){
                left++;//going to the next elemnt 
            }
            else{
                right--;//going to the right side decreasing
            }
        }
    }
            } 
        