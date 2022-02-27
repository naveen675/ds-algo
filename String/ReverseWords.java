class Solution {
	String reverseWords(String s) {
	    // add your logic here
		String [] words = s.split(" ");
		String reverse = "";
		for(int i=words.length-1;i>=0;i--){
			if(i != 0){
				reverse = reverse + words[i]+" ";
		
				}
			else{
				reverse = reverse + words[i];
			}
		}
		return reverse;
			
	}
}