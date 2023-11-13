package com.narasimham;

public class ReverseString {

	public String reverseString(String str) {
		char[] charArray = str.toCharArray();
		System.out.println("charArray : "+charArray);
		
		int left = 0;
		int right = charArray.length - 1;
		System.out.println("right : "+right);
		
		while(left < right) {
			//Swap characters at the left and right position
			System.out.println("Left : "+left+" : right : "+right);
			System.out.println(charArray[left]);
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			System.out.println("charArray : "+charArray);
			//Move the positions towards each other 
			left++;
			right--;
		}
		
		return new String(charArray);
	}
	
	public static void main(String[] args) {
		String name = "narasimham";
		ReverseString r = new ReverseString();
		String result = r.reverseString(name);
		System.out.println("Result : "+result);
	}

}
