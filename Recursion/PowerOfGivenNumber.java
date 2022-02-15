class Solution{
  
  static long powerOfN(int base,int power) {
		
		if(base == 0 || base == 1) {
			return base;
		}
		
		if(power == 0) {
			return 1;
		}
		
		return base*powerOfN(base,power-1);
	}
}
