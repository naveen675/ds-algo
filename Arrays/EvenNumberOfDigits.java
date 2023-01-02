//Problem Statement:
//Given an array of integers, find the elements which have an even number of digits.

//Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
//Answer: 42, 5775, 34, 45, 3556

class EvenDigits
{		// add your logic here
		
		int numberOfDigits;
		List <Integer> evenDigits = new ArrayList<>();
		
		
		for(int index=0;index<arr.length;index++){
			numberOfDigits = totalDigitsOfNumber(arr[index]);
			if(numberOfDigits != 0 && numberOfDigits%2 == 0 ){
				evenDigits.add(arr[index]);
			}
		}
		return evenDigits;
	}
	
	private int totalDigitsOfNumber(int number){
		if(number == 0){
			return 0;
		}
		return 1+totalDigitsOfNumber(number/10);
	}
}
