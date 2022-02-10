class Solution{
  
  static int longestCommonSubSequence(String s1,String s2,int n,int m) {
		
		if(n == 0 || m == 0) {
			return 0;
		}
		
		if(s1.charAt(n-1) == s2.charAt(m-1)) {
			
			return 1+longestCommonSubSequence(s1,s2,n-1,m-1);
		}
		else {
			
			return Math.max(longestCommonSubSequence(s1,s2,n-1,m), longestCommonSubSequence(s1,s2,n,m-1));
			
		}
	}
  
  static int shortestCommonSuperSequence(String s1,String s2) {
		
		int n = s1.length();
		int m = s2.length();
		int lcs = longestCommonSubSequence(s1,s2,n,m);
		int scs = n+m-lcs;
		
		return scs;
		}
}
