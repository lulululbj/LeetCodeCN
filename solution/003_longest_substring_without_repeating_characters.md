# 3. 无重复字符的最长子串

`Medium`

给定一个字符串 `s` ，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:
```
输入: s = "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
```
示例 2:
```
输入: s = "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
```
示例 3:
```
输入: s = "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
```
提示：

* 0 <= s.length <= 5 * 104
* s 由英文字母、数字、符号和空格组成

> 来源：力扣（LeetCode）
> 
> 链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters
> 
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

## 题解

头尾两个指针，尾指针依次往后移动。每移动一位，判断是否有重复字符。

如果有重复字符，移动头指针到头尾指针之间的重复字符的最大位置，并更新最长子串长度。注意头指不能往回移动。

```java
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
```

优化版本，滑动窗口经典写法

```java
    public int solution2(String s) {
        int max = 0;
        int head = 0;
        Character c;
        HashMap<Character, Integer> maps = new HashMap<>();
        for (int tail = 0; tail < s.length(); tail++) {
            c = s.charAt(tail);
            if (maps.containsKey(c)) {
                head = Math.max(head,maps.get(c)+1);
            }
            maps.put(c, tail);
            max = Math.max(max, tail - head + 1);
        }
        return max;
    }
```

* 时间复杂度：O(n)
* 空间复杂度：O(n)