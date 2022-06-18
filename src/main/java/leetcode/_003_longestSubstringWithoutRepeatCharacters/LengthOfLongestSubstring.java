package leetcode._003_longestSubstringWithoutRepeatCharacters;

import java.util.HashMap;

/**
 * @author luyao
 * @description 最长不重复子串
 * @date 2022/6/18 21:30
 */

/*
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
public class LengthOfLongestSubstring {

    /*
     * 头尾两个指针，尾指针依次往后移动。每移动一位，记录子串长度，判断是否有重复字符。
     * 如果有重复字符，移动头指针到重复字符 firstIndex 处，并更新最长子串长度
     */
    public int solution(String s) {
        int max = 0;
        int head = 0;
        Character c;
        HashMap<Character, Integer> maps = new HashMap<>();
        for (int tail = 0; tail < s.length(); tail++) {
            c = s.charAt(tail);
            if (s.substring(head, tail).contains(c.toString())) {
                head = maps.get(c) + 1;
            }
            maps.put(c, tail);
            max = Math.max(max, tail - head + 1);
        }
        return max;
    }
}
