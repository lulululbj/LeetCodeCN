package leetcode._1089_duplicate_zeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author luyao
 * @description
 * @date 2022/6/17 15:02
 */
class DuplicateZerosTest {

    DuplicateZeros duplicateZeros = new DuplicateZeros();


    @Test
    void solution() {
        int[] arr1 = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        int[] arr2 = new int[]{1, 2, 3};
        duplicateZeros.solution(arr1);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr1);

        duplicateZeros.solution(arr2);
        assertArrayEquals(new int[]{1, 2, 3}, arr2);
    }

    @Test
    void solution2() {
        int[] arr1 = new int[]{1, 0, 2, 3, 0, 4, 5, 0};

        duplicateZeros.solution2(arr1);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr1);

        int[] arr2 = new int[]{1, 2, 3};
        duplicateZeros.solution2(arr2);
        assertArrayEquals(new int[]{1, 2, 3}, arr2);

        int[] arr3 = new int[]{0, 0, 0, 0, 0, 0, 0};
        duplicateZeros.solution2(arr3);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 0, 0}, arr3);

        int[] arr4 = new int[]{8, 4, 5, 0, 0, 0, 0, 7};
        duplicateZeros.solution2(arr4);
        assertArrayEquals(new int[]{8, 4, 5, 0, 0, 0, 0, 0}, arr4);
    }
}