package practise;

public class SumOfDigit {
	
	public static int digitSum(int input) {
		
		int sum = input;
		
		while(sum > 9) {
			int s = 0;
			while(sum != 0) {
				int rem = sum % 10;
				sum /= 10;
				s += rem;
			}
			
			sum = s;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitSum(84001));
	}

}
