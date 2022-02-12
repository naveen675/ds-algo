class Solution{
  
  static int longestPalindromicSubSeq(String s,int start,int end) {
		
		if(start == end) {
			return 1;
		}
		if(start > end) {
			return 0;
		}
		
		if(s.charAt(start) == s.charAt(end)) {
			
			return 2+longestPalindromicSubSeq(s,start+1,end-1);
		}
		else {
			
			return Math.max(longestPalindromicSubSeq(s,start+1,end), longestPalindromicSubSeq(s,start,end-1));
		}
		
	}
	
	static int minimumInsToMakePalindrome(String s) {
		
		int end = s.length();
		int start = 0;
		int lps = longestPalindromicSubSeq(s,start,end-1);
		return end-lps;
	}
  
}
