# 35. 搜索插入位置

`Easy`

给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

请必须使用时间复杂度为 `O(log n)` 的算法。

示例 1:
```
输入: nums = [1,3,5,6], target = 5
输出: 2
```

示例2:
```
输入: nums = [1,3,5,6], target = 2
输出: 1
```

示例 3:
```
输入: nums = [1,3,5,6], target = 7
输出: 4
```

提示:

* 1 <= nums.length <= 104
* -104 <= nums[i] <= 104
* nums 为无重复元素的升序排列数组
* -104 <= target <= 104

> 来源：力扣（LeetCode）
> 
> 链接：https://leetcode.cn/problems/search-insert-position
> 
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

## 题解

经典二分法。

```java
    public int solution(int[] nums, int target) {
        if (target > nums[nums.length - 1]) return nums.length;
        if (target < nums[0]) return 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (target < nums[middle]) {
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        // 结束循环的条件是 left = right + 1，这里返回 right + 1 也是一样的
        return left;
    }
```

* 时间复杂度：O(logn)
* 空间复杂度：O(1)