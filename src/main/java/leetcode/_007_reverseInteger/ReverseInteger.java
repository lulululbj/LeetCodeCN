package leetcode._007_reverseInteger;

/**
 * @author luyao
 * @description 整数反转
 * @date 2022/6/20 12:36
 */
public class ReverseInteger {

    public int reverse(int x) {
        int reversedNumber = 0;
        while (x != 0) {
            int temp = reversedNumber * 10 + x % 10;
            // 防止溢出
            if (temp / 10 != reversedNumber) return 0;
            reversedNumber = temp;
            x = x / 10;
            System.out.println("x=" + x + " reversedNumber=" + reversedNumber);
        }
        return reversedNumber;
    }
}
