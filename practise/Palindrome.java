package practise;

public class Palindrome {
	
	static int isPalindrome(int number) {
		
		int freq[] = new int[10];
		int num = number;
		boolean flag = false;
		
		while(num != 0) {
			freq[num%10]++;
			num /= 10;
		}
		
		for(int i = 0; i < 10; i++) {
			
			if(freq[i] % 2 != 0 && !flag) {
				flag = true;
				
			} else if(freq[i] % 2 != 0 && flag) {
				return 1;
			}
		}
		
		return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(12345));
		System.out.println(isPalindrome(12213));
	}

}
