public class RabinKarpAlgo {
	
	static int findHashValue(String s) {
		
		int value =0;
		int power = s.length()-1;
		for(int i=0;i<s.length();i++) {
			
			int charToInt = s.charAt(i);
			value = value + charToInt* (int)(Math.pow(10,power));
			power++;
			
		}
		return value;
	}
	
	static List<Integer> searchForString(String str,String sub) {
		List<Integer> arr = new ArrayList<>();
		int back = 0;
		int front= sub.length();
		
		int subHashValue = findHashValue(sub);
		int strHashValue =0;
		while(front <= str.length()) {
			
			String strSub = str.substring(back,front);
			strHashValue = findHashValue(strSub);
			
			if(strHashValue == subHashValue) {
				arr.add(back);
			}
			back++;
			front++;
		}
		return arr;
		
		
	}