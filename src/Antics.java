/**
 * Lab 2: WordTesting Program
 * This program contains methods to check for palindrome, abecedarian,pangram, and capitalize the first letter.
 * @author Shun Lett Pyae Oo (isPalindrome and isAbecedarian)
 * @author Guillermo Angel (isPangram and capitalizeFirstLetter)
 */
public class Antics {

    /**
     * Checks if a given string is a palindrome, ignoring case.
     *
     * @param word The string to check.
     * @return true if the string is a palindrome, false if it is not.
     */

    public static boolean isPalindrome(String word) {

        if (word == null || word.length() == 0) {
            return true;
        }

        // ignoring case
        word = word.toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It's a palindrome
    }

    /**
     * Checks if a given string is abecedarian,ignoring case.
     *
     * @param word The string to check.
     * @return true if the string is abecedarian, false if it is not.
     */
    public static boolean isAbecedarian(String word) {

        if (word == null || word.length() <= 1) {
            return true;
        }

        // ignoring case
        word = word.toLowerCase();

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false; // Not abecedarian
            }
        }

        return true; // It's abecedarian
    }
    public static String reverseString(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }


    /**
     * Counts the number of vowels in a string.
     *
     * @param word The string to check
     * @return The number of vowels in the string
     */
    public static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }


    /**
     * Removes all spaces from a string.
     *
     * @param word The string from which spaces should be removed
     * @return The string without spaces
     */
    public static String removeSpaces(String word) {
        return word.replace(" ", "");
    }


    /**
     * Checks if a string is a pangram (contains all 26 letters of the alphabet).
     *
     * @param word The string to check
     * @return True if the string is a pangram, false otherwise
     */
    public static boolean isPangram(String word) {
        String lowerCaseInput = word.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (lowerCaseInput.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }


    /**
     * Capitalizes only the first letter of a string.
     *
     * @param word The string to capitalize
     * @return The string with the first letter capitalized
     */
    public static String capitalizeFirstLetter(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
    }
}