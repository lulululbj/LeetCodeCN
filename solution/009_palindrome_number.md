# 9. 回文数

`Easy`

给你一个整数 `x` ，如果 `x` 是一个回文整数，返回 `true` ；否则，返回 `false` 。

回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

例如，121 是回文，而 123 不是。

示例 1：
```
输入：x = 121
输出：true
```

示例 2：
```
输入：x = -121
输出：false
解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
```

示例 3：
```
输入：x = 10
输出：false
解释：从右向左读, 为 01 。因此它不是一个回文数。
```

提示：

* -231 <= x <= 231 - 1

**进阶**：你能不将整数转为字符串来解决这个问题吗？

> 来源：力扣（LeetCode）
> 
> 链接：https://leetcode.cn/problems/palindrome-number
> 
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

## 题解

1. 负数 和 以 0 结尾但不是 0 的数字，都不是回文数
2. 反转一半位数的数字，和另一半比较是否相等
3. 注意位数是偶数和位数是奇数的不同情况

```java
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
```
* 时间复杂度：O(logn)
* 空间复杂度：O(1)