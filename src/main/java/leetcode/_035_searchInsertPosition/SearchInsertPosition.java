package leetcode._035_searchInsertPosition;

/**
 * @author luyao
 * @description 搜索插入位置
 * @date 2022/6/16 23:04
 */

/*
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * 输入: nums = [1,3,5,6], target = 5
 * 输出: 2
 */
public class SearchInsertPosition {

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
}
