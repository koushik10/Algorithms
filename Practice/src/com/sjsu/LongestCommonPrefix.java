package com.sjsu;

public class LongestCommonPrefix {

	public String FindLongstCommPrefix(String[] words) {

		if (words.length == 0)
			return "No Words In the list";
		if (words.length == 1)
			return words[0];
		int minLength =words[0].length();
		for(String s : words){
			if(s.length() < minLength)
				minLength = s.length();
		}
		String common = "";
		for (int i = 0; i < minLength; i++) {
			char temp = words[0].charAt(i);
			boolean check = true;
			for (int j = 1; j < words.length; j++) {
				if (temp != words[j].charAt(i)) {
					check = false;
					break;
				}
			}
			if (check)
				common += temp;
			else
				break;
		}

		return common.toString();

	}

	public static void main(String args[]) {
		String[] words = {"leetcode","le","leed"};
		LongestCommonPrefix obj = new LongestCommonPrefix();
		System.out.println(obj.FindLongstCommPrefix(words));
	}

}
