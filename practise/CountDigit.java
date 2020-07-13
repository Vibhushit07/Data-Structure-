package practise;

public class CountDigit {
	
	static int count(int input) {
		int c = 0;
		
		while(input != 0) {
			input /= 10;
			c++;
		}
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(8400));
		System.out.println(count(84001));
	}

}
