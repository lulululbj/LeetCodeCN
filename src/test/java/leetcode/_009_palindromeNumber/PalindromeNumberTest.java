package leetcode._009_palindromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author luyao
 * @description
 * @date 2022/6/20 11:12
 */
class PalindromeNumberTest {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void isPalindrome() {
        assertTrue(palindromeNumber.isPalindrome(121));
        assertFalse(palindromeNumber.isPalindrome(-121));
        assertFalse(palindromeNumber.isPalindrome(10));
    }
}