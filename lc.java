import java.util.HashSet;
import java.util.Set;

public class DistinctSubstrings {

    public static int countDistinctSubstrings(String s) {
        Set<String> substrings = new HashSet<>();

        // Loop through all possible starting points of substrings
        for (int i = 0; i < s.length(); i++) {
            // Generate substrings starting from index i
            for (int j = i + 1; j <= s.length(); j++) {
                // Add the substring to the set
                substrings.add(s.substring(i, j));
            }
        }

        // Return the size of the set (number of distinct substrings)
        return substrings.size() + 1; // +1 for the empty substring
    }

    public static void main(String[] args) {
        String s = "abc";
        int result = countDistinctSubstrings(s);
        System.out.println("Number of distinct substrings: " + result);
    }
}
