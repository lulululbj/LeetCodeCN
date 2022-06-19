# 567. 字符串的排列

`Medium`

给你两个字符串 `s1` 和 `s2` ，写一个函数来判断 `s2` 是否包含 `s1` 的排列。如果是，返回 `true` ；否则，返回 `false` 。

换句话说，`s1` 的排列之一是 `s2` 的 **子串** 。

示例 1：
```
输入：s1 = "ab" s2 = "eidbaooo"
输出：true
解释：s2 包含 s1 的排列之一 ("ba").
```
示例 2：
```
输入：s1= "ab" s2 = "eidboaoo"
输出：false
```

提示：

* 1 <= s1.length, s2.length <= 104
* s1 和 s2 仅包含小写字母


> 来源：力扣（LeetCode）
> 
> 链接：https://leetcode.cn/problems/permutation-in-string
> 
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

## 题解

s2 包含 s1 的排列，可以理解为 s2 中某个和 s1 长度相同的子串中，拥有的字母的种类和个数和 s1 相同。

这题使用固定长度为 s1.length() 的滑动窗口。在 s2 中不停往右滑动，并与 window 比较。

```java
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
```

* 时间复杂度：O(n)
* 空间复杂度：O(n)