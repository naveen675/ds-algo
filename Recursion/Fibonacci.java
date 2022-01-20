class Fibonacci{

	static int fibo(int num){
		
		if(num == 0){
			return num;
		}
		
		if(num == 1){
			return num;
		
		}
		
		return fibo(num-1)+fibo(num-2);
		
	}
	
	
	
	public static void main(String [] args){
	
		int num = 5;
		
		System.out.println(fibo(num));
	}

}