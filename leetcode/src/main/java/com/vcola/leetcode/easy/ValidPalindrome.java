package com.vcola.leetcode.easy;

/**
 * 125. 验证回文串
 * 
 * @author Very Cola
 * @date 2018年8月13日 上午9:49:58
 */
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		if(s == null || "".equals(s.trim())){
			return true;
		}
		
		
		
		return true;
	}

	
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		boolean result = new ValidPalindrome().isPalindrome(s);
		System.out.println(result);
		
		System.out.println(0+'A');
		System.out.println(0+'Z');
		System.out.println(0+'a');
		System.out.println(0+'z');
		System.out.println(0+'0');
		System.out.println(0+'9');
		
	}
	
}
