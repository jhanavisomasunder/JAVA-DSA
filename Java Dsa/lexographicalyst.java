import java.util.*;

public class lexographicalyst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        String s = sc.nextLine();
        int k = sc.nextInt();

        // Initialize smallest and largest substrings
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Traverse all possible substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);

            // Update smallest if current is lexicographically smaller
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            // Update largest if current is lexicographically larger
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        // Print results
        System.out.println(smallest);
        System.out.println(largest);
    }
}
