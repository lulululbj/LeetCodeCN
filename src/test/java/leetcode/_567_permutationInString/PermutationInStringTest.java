package leetcode._567_permutationInString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author luyao
 * @description
 * @date 2022/6/19 08:19
 */
class PermutationInStringTest {

    private final PermutationInString permutationInString = new PermutationInString();

    @Test
    void checkInclusion() {
        assertTrue(permutationInString.checkInclusion("ab", "eidbaooo"));
        assertFalse(permutationInString.checkInclusion("ab", "eidboaoo"));
        assertTrue(permutationInString.checkInclusion("adc", "dcda"));
    }
}