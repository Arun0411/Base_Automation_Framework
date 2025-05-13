package BrowserFactory;

public class Problem1 {

    // Method to find the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        String output = "";  // To Store the current substring without repeating characters
        int maxLength = 0;   // Tracks the maximum length

        // Iterate over each character in the input string
        for (char c : s.toCharArray()) {
            int index = output.indexOf(c);  // Check if the character already exists in the current substring

            // If the character is found, remove all characters up to and including the repeated character
            if (index != -1) {
                output = output.substring(index + 1);
            }

            // Append the current character to the substring
            output += c;

            // Update maxLength if the current substring is longer than the previous maximum
            maxLength = Math.max(maxLength, output.length());
        }

        // Return the length of the longest substring without repeating characters
        return maxLength;
    }

    public static void main(String[] args) {
        // Input string
        String input = "abcabcbb";

        // Call the method and store the result
        int result = lengthOfLongestSubstring(input);

        // Print the input and result
        System.out.println("Input: " + input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}


//Validated this with multiple inputs - aaaaaaa, bbbbbabcdef, a1b2c3a4, abccba
