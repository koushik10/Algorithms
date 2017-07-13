package com.sk;

public class StringCompression {
	
	public String stringCopmression(String s){
		
		String temp=s;
		int count=1, prev=0;
		StringBuffer sb = new StringBuffer();
		
		if(!s.isEmpty()){
		for(int next=1; next<s.length();next++){
				if((s.charAt(prev)==s.charAt(next))){
					count++;
				}
				else{
					sb.append(s.charAt(prev));
					sb.append(count);
					count=1;
				}
				
				prev++;
		}
		sb.append(s.charAt(prev));
		sb.append(count);
		return sb.toString();
		}
		else{
			return "Empty string";
		}
	}
	
	public static void main(String args[]){
		
		StringCompression sc = new StringCompression();
		System.out.println(sc.stringCopmression("a"));
	}

}
