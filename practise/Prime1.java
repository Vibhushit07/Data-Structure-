package practise;

public class Prime1 {

	static int primeNumbers(int start, int end) {
		int count = 0;
		for(int i = start; i <= end; i++) {
			if(isPrime(i)) 
				count++;
		}
		
		return count;
	}
	
	static boolean isPrime(int number) {
		
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
		System.out.println(primeNumbers(700, 725));
	}

}
