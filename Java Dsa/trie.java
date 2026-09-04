import java.util.*;
public class trie {
    static String sortCharacters(String s){
        char[] arr =s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a string:");
    String input=sc.nextLine();
    String sortedString = sortCharacters(input);
    System.out.println("sorted charcters :" +sortedString);
}
    
}
