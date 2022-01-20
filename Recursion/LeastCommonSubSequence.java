import java.util.*;
class LeastCommonSubSequence{

	public static int Lcs(String s1,String s2,int n,int m){
		
		if(n == 0 || m == 0){
			return 0;
		}
		
		if(s1.charAt(n-1) == s2.charAt(m-1)){
			return 1+Lcs(s1,s2,n-1,m-1);
		}
		
		else{
			return Math.max(Lcs(s1,s2,n,m-1),Lcs(s1,s2,n-1,m));
		}
	}

	public static void main(String [] args){
		
		String s1= "workattech";
		String s2= "branch";
		
		System.out.println(Lcs(s1,s2,s1.length(),s2.length()));
	}
}