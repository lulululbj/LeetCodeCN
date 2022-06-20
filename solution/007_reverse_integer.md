# 1. 整数反转

`Medium`

给你一个 32 位的有符号整数 `x` ，返回将 `x` 中的数字部分反转后的结果。

如果反转后整数超过 32 位的有符号整数的范围 `[−2^31, 2^31− 1]` ，就返回 0。

**假设环境不允许存储 64 位整数（有符号或无符号）。**

示例 1：
```
输入：x = 123
输出：321
```
示例 2：
```
输入：x = -123
输出：-321
```
示例 3：
```
输入：x = 120
输出：21
```
示例 4：
```
输入：x = 0
输出：0
```

提示：

* -2^31 <= x <= 2^31 - 1

> 来源：力扣（LeetCode）
> 
> 链接：https://leetcode.cn/problems/reverse-integer
> 
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

## 题解

反转数字的算法，`reversedNumber= reversedNumber * 10 + x % 10` 。

注意溢出的情况。这里取巧用 temp/10 是否等于 reversedNumber 来判断。

```java
    public int reverse(int x) {
        int reversedNumber = 0;
        while (x != 0) {
            int temp = reversedNumber * 10 + x % 10;
            // 防止溢出
            if (temp / 10 != reversedNumber) return 0;
            reversedNumber = temp;
            x = x / 10;
        }
        return reversedNumber;
    }
```
* 时间复杂度：O(logn)
* 空间复杂度：O(1)