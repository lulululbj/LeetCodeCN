package leetcode._001_twoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author luyao
 * @description
 * @date 2022/6/16 10:46
 */
class TwoSumTest {

    int[] nums = {3, 2, 8, 2};
    int target = 11;
    int target2 = 12;

    @org.junit.jupiter.api.Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.solution(nums, target);
        int[] result2 = twoSum.solution(nums, target2);
        assertEquals(target, nums[result[0]] + nums[result[1]]);
        assertNull(result2);
    }

    @Test
    void solution2() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.solution2(nums, target);
        int[] result2 = twoSum.solution2(nums, target2);
        assertEquals(target, nums[result[0]] + nums[result[1]]);
        assertNull(result2);
    }

//    @Test
//    void solution3() {
//        TwoSum twoSum = new TwoSum();
//        int[] result = twoSum.solution3(nums, target);
//        int[] result2 = twoSum.solution3(nums, target2);
//        assertEquals(target, nums[result[0]] + nums[result[1]]);
//        assertNull(result2);
//    }
}