class UnBoundedKnapSack{

	public static int knapSacUnBounded(int [] weight,int [] price,int length,int capacityLeft){
		
		if(capacityLeft <= 0 || length <= 0){
			return 0;
		}
		
		int maxWeight = knapSacUnBounded(weight,price,length-1,capacityLeft);
		
		if(weight[length-1] <= capacityLeft){
			
			maxWeight = Math.max(knapSacUnBounded(weight,price,length,capacityLeft-weight[length-1])+price[length-1],maxWeight);
		}
		
		return maxWeight;
	}
	
	public static void main(String [] args){
		
		int [] w = {2, 1, 3, 4};
		int [] val =  {7,3,4,8};
		int W =  5;
		
		System.out.println(knapSacUnBounded(w,val,w.length,W));
	}
	
}