import java.util.*;

class Lps{

	public static int LongestPalindromicSubSequence(String s1,int startIndex,int endIndex){
		
		if(startIndex == endIndex){
			return 1;
		}
		
		if(startIndex > endIndex){
			return 0;
		}
		
		if(s1.charAt(startIndex) == s1.charAt(endIndex)){
			return 2+LongestPalindromicSubSequence(s1,startIndex+1,endIndex-1);
		}
		
		else{
			return Math.max(LongestPalindromicSubSequence(s1,startIndex+1,endIndex),LongestPalindromicSubSequence(s1,startIndex,endIndex-1));
		}
	}
	
	
	public static void main(String [] args){
		
		String s1 = "abcdbda";
		
		System.out.println(LongestPalindromicSubSequence(s1,0,s1.length()-1));
	}
}