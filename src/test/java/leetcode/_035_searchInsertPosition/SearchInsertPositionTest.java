package leetcode._035_searchInsertPosition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author luyao
 * @description
 * @date 2022/6/16 23:22
 */
class SearchInsertPositionTest {

    @Test
    void solution() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int result1 = searchInsertPosition.solution(new int[]{1, 2, 3, 4, 5}, 4);
        assertEquals(3, result1);

        int result2 = searchInsertPosition.solution(new int[]{1, 2, 3, 4, 5, 6}, 5);
        assertEquals(4, result2);

        int result3 = searchInsertPosition.solution(new int[]{1, 3, 4, 5, 6}, 2);
        assertEquals(1, result3);
    }
}