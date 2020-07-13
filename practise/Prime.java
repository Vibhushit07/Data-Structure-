package practise;

public class Prime {
	
	public static int nthPrime(int input) {
		int count = 0, number = 1;
		
		while(count != input) {
			
			number++;
			
			if(isPrime(number)) {
				count++;
			}
		}
		
		return number;
	}
	
	public static boolean isPrime(int number) {
		
		if(number == 1)
			return false;
		
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthPrime(4));
	}

}
