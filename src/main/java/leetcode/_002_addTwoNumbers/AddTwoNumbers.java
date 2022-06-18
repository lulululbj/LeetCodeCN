package leetcode._002_addTwoNumbers;

import common.ListNode;

/**
 * @author luyao
 * @description 两数相加
 * @date 2022/6/18 10:52
 */

/*
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 */
public class AddTwoNumbers {

    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        int t = 0;
        while (l1 != null || l2 != null || t > 0) {
            if (l1 != null) {
                t += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                t += l2.val;
                l2 = l2.next;
            }
            node.next = new ListNode(t % 10);
            t = t / 10;
            node = node.next;
        }
        return dummy.next;
    }
}
