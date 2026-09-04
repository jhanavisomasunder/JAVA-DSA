/*public class substring {
    public static void main(String[] args) {
        String s="hii";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
    
}
//n(n+1)/2   to know the no. of substrings*/
// palindrome 
import java.util.*;//to take the input so we use this

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break; // Stop immediately if characters don't match
            }
            left++;
            right--;
        }

        // Print the result exactly ONCE after checking all characters
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not a palindrome");
        }

        System.out.println("ok got it");
    }
}
