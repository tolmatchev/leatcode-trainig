package org.example.strings;

public class Palindrome {
    /**
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
     *
     * Given a string s, return true if it is a palindrome, or false otherwise.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     * Example 2:
     *
     * Input: s = "race a car"
     * Output: false
     * Explanation: "raceacar" is not a palindrome.
     * Example 3:
     *
     * Input: s = " "
     * Output: true
     * Explanation: s is an empty string "" after removing non-alphanumeric characters.
     * Since an empty string reads the same forward and backward, it is a palindrome.
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 2 * 105
     * s consists only of printable ASCII characters.
     *
     * @param s
     * @return
     */
    //227 ms
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 96 && s.charAt(i) < 123 || s.charAt(i) > 47 && s.charAt(i) < 58) {
                result.append(s.charAt(i));
            }
            if (s.charAt(i) > 64 && s.charAt(i) < 91) {
                result.append((char) (s.charAt(i) + 32));
            }
        }

        for (int i = 0, j = result.toString().length() - 1; i < j; i++, j--) {
            if (result.toString().charAt(i) != result.toString().charAt(j)) {
                return false;
            }
        }
        return true;
    }

    //2 ms
    public boolean isPalindrome2(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
                j--;
            }
            if (Character.toUpperCase(s.charAt(i)) != Character.toUpperCase(s.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    private char validLetter(char ch) {
        if (ch > 96 && ch < 123 || ch > 47 && ch < 58) {
            return ch;
        }
        if (ch > 64 && ch < 91) {
            return (char) (ch + 32);
        }
        return (char) 0;
    }

}
