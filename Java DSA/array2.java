import java.util.*;
public class array2{
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int x=4;//target element which to choose
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            System.out.println("got it");
            break;
        }
        else{
            System.out.println("not found");
        }
    }
}
}
