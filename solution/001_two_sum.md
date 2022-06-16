# 1. 两数之和

`Easy`

给定一个整数数组 `nums` 和一个整数目标值 `target`，请你在该数组中找出 **和为目标值** `target` 的那两个整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

示例 1：

```
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
```

示例 2：
```
输入：nums = [3,2,4], target = 6
输出：[1,2]
```
示例 3：
```
输入：nums = [3,3], target = 6
输出：[0,1]
```

提示：

* `2 <= nums.length <= 104`
* `-109 <= nums[i] <= 109`
* `-109 <= target <= 109`
* 只会存在一个有效答案

进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？


> 来源：力扣（LeetCode)
> 
> 链接：https://leetcode.cn/problems/two-sum
> 
> 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

## 题解

### 解法1
下意识的解决方案，遍历数组中每一个元素 x，并寻找数组中是否存在 target-x 。

```java
public int[] solution(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target)
                return new int[]{i, j};
        }
    }
    return null;
}
```

* 时间复杂度：O(n^2)，对于每一个元素，都会对数组中剩余部分进行遍历以寻找 target-x ，显然，时间复杂度为 O(n^2)
* 空间复杂度：O(1)

### 解法2
查找元素，我们很自然的会想到哈希表，哈希表的查找时间几乎恒定为 O(1)。在哈希表中以索引为值，索引处的值为键进行存储，只需要一次遍历，对于每一个元素 x，判断哈希表中是否 `containsKey(target-x)`，不存在则将该元素塞入哈希表，若存在直接返回该元素和对应的 target-x。

```java
public int[] solution2(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i]))
            return new int[]{i, map.get(target - nums[i])};
        map.put(nums[i], i);
    }
    return null;
}
```

* 时间复杂度：O(n)，只需一次遍历，且查找时间为 O(1)
* 空间复杂度：O(n)，需要的额外空间为一个哈希表，至多存储 n 个元素

方案2 就是典型的空间换时间，在对空间限制不大的情况下，将大大提升算法的效率。

### 解法3

双指针法仅适用于已排序的数组，这一题不适合，可以理解一下思想。

将数组排序好，定义 left，right 两个指针分别指向数组首位。

如果 nums[left] + nums[right] > target，将 left 指针右移，

如果 nums[left] + nums[right] < target，将 right 指针左移，

如果 nums[left] + nums[right] = target，返回 int[]{left,right} 。

