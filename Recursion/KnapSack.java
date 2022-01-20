import java.util.*;

class KnapSack{

	public static int knap(int [] weight,int [] price,int length,int capacityLeft){
		
		if(capacityLeft <= 0 || length <= 0){
			return 0;
		}
		
		int maxWeight = knap(weight,price,length-1,capacityLeft);
		if(weight[length-1] <= capacityLeft){
			
			maxWeight = Math.max(knap(weight,price,length-1,capacityLeft-weight[length-1])+price[length-1],knap(weight,price,length-1,capacityLeft));
			
		}
		return maxWeight;
	}


	public static void main(String [] args){
		
		int [] w = {2, 1, 3, 4};
		int [] val =  {5, 3, 4, 7};
		int W =  5;
		
		System.out.println(knap(w,val,w.length,W));
	}
}