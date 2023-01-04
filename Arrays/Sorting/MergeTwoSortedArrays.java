class Sorting {
	int[] mergeSortedArrays(int[] A, int[] B) {
	    // add your logic here
		
		
		int AIndex =0;
		int BIndex = 0;
		int ALength =A.length;
		int BLength = B.length;
		int [] mergedArray = new int[ALength+BLength];
		int mergedArrayIndex =0;
		
		while(AIndex < ALength && BIndex < BLength){
			
			if(A[AIndex] < B[BIndex]){
				
				mergedArray[mergedArrayIndex++] = A[AIndex++];
			}
			else{
				mergedArray[mergedArrayIndex++] = B[BIndex++];
			}
		}
		
		for(int i=AIndex;i<ALength;i++){
			
			mergedArray[mergedArrayIndex++] = A[i];
		}
		for(int j=BIndex; j<BLength;j++){
			
			mergedArray[mergedArrayIndex++] = B[j];
		}
		
		return mergedArray;
		
	
	}
}
