package com.vcola.leetcode.common;

public class ListNode {

	public int val;

	public ListNode next;

	public ListNode(int x) {
		val = x;
		next = null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		ListNode node = this;
		while(node != null){
			sb.append(node.val);
			node = node.next;
			if(node != null){
				sb.append("->");
			}
		}
		return sb.toString();
	}
}
