class CumulativeSum {
	List<Integer> getPositiveCumulativeSum (int[] arr) {
		// add your logic here
		
		List<Integer> positiveCumulativeSum = new ArrayList<>();
		 
		int arrLength = arr.length;
		
		if(arr[0] > 0){
			positiveCumulativeSum.add(arr[0]);
		}
		
		for(int i=1; i<arrLength;i++){
			
			arr[i] = arr[i-1]+arr[i];
			
			if(arr[i] > 0){
				positiveCumulativeSum.add(arr[i]);
			}
		}
		
		return positiveCumulativeSum;
	}
}
