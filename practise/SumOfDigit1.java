package practise;

public class SumOfDigit1 {

	static int sum(int input, char option) {
		int sumEven = 0, sumOdd = 0;
		
		while(input != 0) {
			int rem = input % 10;
			input /= 10;
			//checking the digit if it is odd or even
			if(rem % 2 == 0) {  
				sumEven += rem;
			} else {
				sumOdd += rem;
			}
		}
		
		if(option == 'e') return sumEven;
		return sumOdd;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(84001, 'e'));
	}

}
