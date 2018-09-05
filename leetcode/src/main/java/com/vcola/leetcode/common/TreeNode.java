package com.vcola.leetcode.common;

import java.util.Arrays;

public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}
	
	public static Integer[] toArray(TreeNode root) {
		if(root == null){
			return null;
		}
		// 求出最大深度
		int depth = depth(root);
		Integer[] result = new Integer[(int)Math.pow(2, depth) - 1];
		
		fillArray(root, 0, result);
		
		return result;
	}
	
	private static void fillArray(TreeNode node, int index, Integer[] result) {
		if(node == null){
			return;
		}
		result[index] = node.val;
		fillArray(node.left, 2*(index+1) - 1, result);
		fillArray(node.right,  2*(index+1), result);
	}

	public static int depth(TreeNode root) {
		return depth(root, 0);
	}

	private static int depth(TreeNode node, int depth) {
		if(node == null){
			return depth;
		}
		return Math.max(depth(node.left, depth+1), depth(node.right, depth+1));
	}


	public static TreeNode valueOf(Integer[] vals){
		if(vals == null || vals.length == 0){
			return null;
		}
		return build(vals, 0);
	}
	
	private static TreeNode build(Integer[] vals, int index) {
		if(index >= vals.length || vals[index] == null){
			return null;
		}
		TreeNode node = new TreeNode(vals[index]);
		node.left = build(vals, 2*(index+1) - 1);
		node.right = build(vals, 2*(index+1));
		return node;
	}
	
	public static void main(String[] args) {
		TreeNode treeNode = valueOf(new Integer[]{1, 3, 5, null, 8, null, null, null, null, 9, null, null, null, null, null});
		System.out.println(depth(treeNode));
		Integer[] vals = toArray(treeNode);
		System.out.println(Arrays.toString(vals));
	}
}
