class Solution{
  
    static int longestRepeatingSubSequence(String s1,int m,int n) {
		
		if(m == 0 || n == 0) {
			return 0;
		}
		
		if(m!=n && s1.charAt(m-1) == s1.charAt(n-1) ) {
			
			return 1+longestRepeatingSubSequence(s1,m-1,n-1);
		}
		
		else {
			return Math.max(longestRepeatingSubSequence(s1,n-1,m), longestRepeatingSubSequence(s1,n,m-1));
		}
		
	}
	
	static int lps(String s) {
		
		int n =s.length();
		int m = s.length();
		
		return longestRepeatingSubSequence(s,m,n);
		
	}
}
