/**
 * Problem: Remove All Adjacent Duplicates in String
 * Approach: Use StringBuilder as a stack
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public String removeDuplicates(String s) {
        // Using StringBuilder as a stack
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int length = sb.length();

            // Check if last character matches current character
            if (length > 0 && sb.charAt(length - 1) == ch) {
                // Remove last character (duplicate found)
                sb.deleteCharAt(length - 1);
            } else {
                // Add character to result
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
