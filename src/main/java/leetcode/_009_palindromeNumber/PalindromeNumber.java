package leetcode._009_palindromeNumber;

/**
 * @author luyao
 * @description 回文数
 * @date 2022/6/20 11:10
 */
public class PalindromeNumber {

    /*
     * 121 true -121 false 10 false
     */
    public boolean isPalindrome(int x) {
        // 负数 和 以 0 结尾但不是 0 的数字，都不是回文数
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int reversedNumber = 0;
        // 反转一半位数的数字
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x = x / 10;
        }
        // 注意位数是偶数和位数是奇数的情况
        return x == reversedNumber || x == reversedNumber / 10;
    }
}
