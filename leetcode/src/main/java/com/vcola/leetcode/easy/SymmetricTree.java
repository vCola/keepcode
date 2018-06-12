package com.vcola.leetcode.easy;

/**
 * 101. 对称二叉树
 * 
 * @author liuhongjun
 * @date 2018年6月8日 上午9:20:29
 */
public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}

		if (left == null && right != null) {
			return false;
		}

		if (left != null && right == null) {
			return false;
		}

		if (left.val != right.val) {
			return false;

		}

		if (!isSymmetric(left.left, right.right)) {
			return false;
		}

		return isSymmetric(left.right, right.left);
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}
