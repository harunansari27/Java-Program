package AMAZON;

public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {
        // Step 1: Length check
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Frequency array
        int[] freq = new int[26];

        // Step 3: Count characters of first string
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 4: Reduce count using second string
        for (char c : s2.toCharArray()) {
            freq[c - 'a']--;
        }

        // Step 5: Check if all counts are zero
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAnagram(s1, s2)); // true
    }
}
