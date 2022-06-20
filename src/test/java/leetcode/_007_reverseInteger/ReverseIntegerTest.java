package leetcode._007_reverseInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author luyao
 * @description
 * @date 2022/6/20 12:37
 */
class ReverseIntegerTest {

    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    void reverse() {
        assertEquals(321, reverseInteger.reverse(123));
        assertEquals(-321, reverseInteger.reverse(-123));
        assertEquals(21, reverseInteger.reverse(120));
        assertEquals(0, reverseInteger.reverse(0));
        assertEquals(0, reverseInteger.reverse(1534236469));
    }
}