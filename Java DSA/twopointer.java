import java.util.*;
public class twopointer{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,9,11,16};
        int left=0;
        int right=arr.length-1;
        int target=15;
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
        