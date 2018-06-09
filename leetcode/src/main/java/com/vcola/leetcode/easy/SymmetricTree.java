package com.vcola.leetcode.easy;


/**
 * 101. 对称二叉树
 * 
 * @author liuhongjun
 * @date 2018年6月8日 上午9:20:29
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        
        if(root.left == null && root.right != null){
            return false;
        }
        
        if(root.left != null && root.right == null){
            return false;
        }
        
        
        
        
        
        
        return true;
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
