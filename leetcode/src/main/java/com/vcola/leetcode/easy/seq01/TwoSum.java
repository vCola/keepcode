package com.vcola.leetcode.easy.seq01;

/**
 * 1. 两数之和
 * @author Very Cola
 * @date 2018年5月22日 上午9:21:59
 */
public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
    

}