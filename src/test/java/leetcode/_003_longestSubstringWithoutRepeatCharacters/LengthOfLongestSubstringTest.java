package leetcode._003_longestSubstringWithoutRepeatCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author luyao
 * @description
 * @date 2022/6/18 21:31
 */
class LengthOfLongestSubstringTest {

    private final LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();

    @Test
    void solution() {
        assertEquals(3,lengthOfLongestSubstring.solution("dvdf"));
        assertEquals(3,lengthOfLongestSubstring.solution("abcabcbb"));
        assertEquals(1,lengthOfLongestSubstring.solution("bbbbb"));
        assertEquals(3,lengthOfLongestSubstring.solution("pwwkew"));
        assertEquals(0,lengthOfLongestSubstring.solution(""));
    }
}