class Solution{
  
  static int longestCommonString(String s1,String s2,int n,int m,int count) {
		
		if(n == 0 || m == 0) {
			return count;
		}
		
		if(s1.charAt(n-1) == s2.charAt(m-1)) {
			return longestCommonString(s1,s2,n-1,m-1,count+1);
		}
		
		else {
			
			return Math.max(count, Math.max(longestCommonString(s1,s2,n-1,m,0), longestCommonString(s1,s2,n,m-1,0)));
		}
		
	}
	
	static int longestCommonString(String s1,String s2) {
		
		int n = s1.length();
		int m = s2.length();
		
		return longestCommonString(s1,s2,n,m,0);
	}
}
