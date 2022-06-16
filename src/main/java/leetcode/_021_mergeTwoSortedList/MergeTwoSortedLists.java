package leetcode._021_mergeTwoSortedList;

import common.ListNode;

/**
 * @author luyao
 * @description 合并两个有序列表
 * @date 2022/6/16 14:24
 */

/*
 * 将两个升序链表合并为一个新的 **升序** 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例 1：
 *
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 *
 * 示例 2：
 *
 * 输入：l1 = [], l2 = []
 * 输出：[]
 *
 * 示例 3：
 *
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 *
 * 提示：
 *
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 */
public class MergeTwoSortedLists {

    /*
     * 循环解法
     */
    public ListNode solution(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                node.next = list2;
                list2 = list2.next;
            } else {
                node.next = list1;
                list1 = list1.next;
            }
            node = node.next;
        }
        if (list1 == null) {
            node.next = list2;
        }
        if (list2 == null) {
            node.next = list1;
        }
        return dummy.next;
    }

    /*
     * 递归解法
     */
    public ListNode solution2(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if (list1.val > list2.val) {
            list2.next = solution2(list1, list2.next);
            return list2;
        } else {
            list1.next = solution2(list2, list1.next);
            return list1;
        }
    }
}
