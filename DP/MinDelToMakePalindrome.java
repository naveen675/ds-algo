class Solution{
  
  static int lpss(String s,int start,int end) {
		
		if(start == end) {
			return 1;
		}
		if(start > end) {
			return 0;
		}
		
		if(s.charAt(start) == s.charAt(end)) {
			
			return 2 + lpss(s,start+1,end-1);
			
		}
		
		else {
			return Math.max(lpss(s,start+1,end), lpss(s,start,end-1));
		}
		
	}
	
	static int minimumDelToMakePalindrome(String s) {
		
		int n = s.length();
		
		int lps = lpss(s,0,n-1);
		int minDel = n-lps;
		
		return minDel;
	}
}
