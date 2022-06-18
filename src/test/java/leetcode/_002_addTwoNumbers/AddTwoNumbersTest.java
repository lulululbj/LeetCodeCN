package leetcode._002_addTwoNumbers;

import common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author luyao
 * @description
 * @date 2022/6/18 11:00
 */
class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void solution() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode result = addTwoNumbers.solution(l1, l2);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);

        ListNode l3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result2 = addTwoNumbers.solution(l3, l4);
        assertEquals(8, result2.val);
        assertEquals(9, result2.next.val);
        assertEquals(9, result2.next.next.val);
        assertEquals(9, result2.next.next.next.val);
        assertEquals(0, result2.next.next.next.next.val);
        assertEquals(0, result2.next.next.next.next.next.val);
        assertEquals(0, result2.next.next.next.next.next.next.val);
        assertEquals(1, result2.next.next.next.next.next.next.next.val);
    }
}