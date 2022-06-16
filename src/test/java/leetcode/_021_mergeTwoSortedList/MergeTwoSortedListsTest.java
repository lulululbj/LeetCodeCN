package leetcode._021_mergeTwoSortedList;

import common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author luyao
 * @description
 * @date 2022/6/16 14:42
 */
class MergeTwoSortedListsTest {

    private ListNode l1;
    private ListNode l2;

    @BeforeEach
    void setUp() {
        l1 = new ListNode(1, new ListNode(3, new ListNode(4)));
        l2 = new ListNode(1, new ListNode(2));
    }

    @Test
    void solution() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode node = mergeTwoSortedLists.solution(l1, l2);
        assertEquals(1, node.val);
        assertEquals(1, node.next.val);
        assertEquals(2, node.next.next.val);
        assertEquals(3, node.next.next.next.val);
        assertEquals(4, node.next.next.next.next.val);
    }

    @Test
    void solution2() {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode node = mergeTwoSortedLists.solution2(l1, l2);
        assertEquals(1, node.val);
        assertEquals(1, node.next.val);
        assertEquals(2, node.next.next.val);
        assertEquals(3, node.next.next.next.val);
        assertEquals(4, node.next.next.next.next.val);
    }
}