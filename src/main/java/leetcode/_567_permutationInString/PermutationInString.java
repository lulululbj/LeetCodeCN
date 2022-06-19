package leetcode._567_permutationInString;

import java.util.Arrays;

/**
 * @author luyao
 * @description 字符串排列
 * @date 2022/6/19 08:14
 */

/*
 * 给你两个字符串 `s1` 和 `s2` ，写一个函数来判断 `s2` 是否包含 `s1` 的排列。如果是，返回 `true` ；否则，返回 `false` 。
 *
 * 换句话说，`s1` 的排列之一是 `s2` 的 **子串** 。
 *
 * 示例 1：
 *
 * 输入：s1 = "ab" s2 = "eidbaooo"
 * 输出：true
 * 解释：s2 包含 s1 的排列之一 ("ba").
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        if (s1Length > s2Length) return false;
        int[] window = new int[26];
        int[] s2Count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            window[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (Arrays.equals(window, s2Count)) return true;
            s2Count[s2.charAt(i) - 'a']--;
            s2Count[s2.charAt(i+ s1.length()) - 'a']++;
        }
        return Arrays.equals(window, s2Count);
    }
}
