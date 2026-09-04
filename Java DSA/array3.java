/*import java.util.*;
public class array3{
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9,10};// to print array for loop
    for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
    }
}*/
//user giving input we use scanner
/*import java.util.*;
public class array3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int arr[]= new int[10];//10 spaces is stored the int nos.
         System.out.println("Enter your number");
         for(int i=0;i<arr.length;i++){ //assigning values- to traverse each location 
            arr[i]=sc.nextInt();// we are gigving values which will be assigned to the particulaar index with the help of for lop

         }
         //this loop is to print all the elements 
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
        }
    }*/

// completly program is depending on user but the size is there where the user is depending on program

/*import java.util.*;
public class array3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int size =sc.nextInt();
         int arr[]= new int[size];//1st input is the size where the user can the give the size
         System.out.println("Enter your number");
         for(int i=0;i<arr.length;i++){ //assigning values- to traverse each location 
            arr[i]=sc.nextInt();// we are gigving values which will be assigned to the particulaar index with the help of for lop

         }
         //this loop is to print all the elements 
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
         }
        }
    }*/
    // in this pro. the program is completely dependent on the user
    //sum of array
    /*import java.util.*;
public class array3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int size =sc.nextInt();
         int arr[]= new int[size];
         int sum=0;
         System.out.println("Enter your number");
         for(int i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt();

         }
         for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
         }
         System.out.println("sum:");
         System.out.println(sum);
        }
    }*/
/*import java.util.*;
public class array3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int size =sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter your number");
         for(int i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt();
         }
         int max=arr[0];//taking first element as max element
         for(int i=0;i<arr.length;i++){
         if(arr[i]>max){ //assigning the elemnt as max
            max=arr[i];
         } 
         }
         System.out.println("Maximun:"+max);
        }
    }*/
   // min of array
    /*import java.util.*;
public class array3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int size =sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter your number");
         for(int i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt();
         }
         int min=arr[0];//taking first element as max element
         for(int i=0;i<arr.length;i++){
         if(arr[i]<min){ //assigning the elemnt as max
            min=arr[i];
         } 
         }
         System.out.println("Minimun:"+min);
        }
    }*/
   // search an elemnt and print index
   import java.util.*;
public class array3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("enter the target element :");
        int target=sc.nextInt();
        System.out.println("Enter your number");
         for(int i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt();
         }
         boolean found=false; // not to print not found again and again we can do pro. without this only
         for(int i=0;i<arr.length;i++){
         if(arr[i]==target){ 
           System.out.println("Target found at index: "+i);
           found =true; //if the elment is found set the flag is true
         } 
        }//out of for lop
         if(!found){// (!true) then false print not found
            System.out.println("not found");
         }
        }
    }
   //combining the max and min in the same pro.
   /*import java.util.*;
public class array3{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size");
        int size =sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter your number");
         for(int i=0;i<arr.length;i++){ 
            arr[i]=sc.nextInt();
         }
         int max=arr[0];
         int min=arr[0];
         for(int i=0;i<arr.length;i++){
         if(arr[i]>max){ //assigning the elemnt as max
            max=arr[i];
         } 
         if(arr[i]<min){ //assigning the elemnt as max
            min=arr[i];
         } 
         }
         System.out.println("Maximun:"+max);
         System.out.println("Minimum:"+min);
        }
    }*/
    