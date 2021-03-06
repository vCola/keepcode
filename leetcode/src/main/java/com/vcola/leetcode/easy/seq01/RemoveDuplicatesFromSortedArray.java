package com.vcola.leetcode.easy.seq01;

import java.util.Arrays;

/**
 * 26. 删除排序数组中的重复项
 *
 * @author Very Cola
 * @date 2018年5月25日 上午9:28:03
 */
public class RemoveDuplicatesFromSortedArray {

  /**
   * 返回移除后数组的新长度
   *
   * @param nums
   * @return
   */
  public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    int length = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[length - 1] != nums[i]) {
        if (length != i) {
          nums[length] = nums[i];
        }
        length++;
      }
    }

    return length;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

    RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();

    int newLenght = removeDuplicates.removeDuplicates(nums);
    System.out.println(newLenght);
    System.out.println(Arrays.toString(nums));
  }

}
