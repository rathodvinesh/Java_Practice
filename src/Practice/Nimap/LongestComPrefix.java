package Practice.Nimap;

public class LongestComPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","float"};

        if (str == null || str.length == 0) {
            System.out.print(""); // Edge case: Empty input
            return;
        }

        String pref = str[0]; // Start with first string
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(pref) != 0) {  // Check if it’s a prefix
                pref = pref.substring(0, pref.length() - 1); // Trim last character
                if (pref.isEmpty()) {
                    System.out.print(""); // No common prefix
                    return;
                }
            }
        }

        System.out.print(pref); // Print the longest common prefix
    }
}
