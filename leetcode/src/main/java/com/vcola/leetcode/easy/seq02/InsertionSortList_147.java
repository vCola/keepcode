package com.vcola.leetcode.easy.seq02;

import com.vcola.leetcode.common.ListNode;

public class InsertionSortList_147 {

  public ListNode insertionSortList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode next = head.next;
    while (next != null) {
      ListNode temp = head;
      while (temp != next) {
        if (next.val <= temp.val) {
          // swap next and temp
          ListNode tempNode = temp;



          break;
        }
        temp = temp.next;
        next = next.next;
      }
    }
    return head;
  }

  public static void main(String[] args) {
    ListNode head = ListNode.valOf(new int[] { 3, 4, 2 });
    System.out.println(head);
    head = new InsertionSortList_147().insertionSortList(head);
    System.out.println(head);
  }
}
