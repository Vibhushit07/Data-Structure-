package practise;

public class Fibonacci {
	
	static void nthTerm(int input) {
		
		int a = 0, b = 1, c = 1;
		
		for(int i = 1; i < input; i++) {
			c = a + b; // current term
			// updated previous term
			a = b; 
			b = c;
		}
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nthTerm(4);
		nthTerm(2);
		nthTerm(10);
		nthTerm(15);
	}

}
