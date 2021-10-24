package practise;

public class Frequency {
	
	static int digitFre(int x) {
		
		//array to store frequency of digit
		int freq[] = new int[10];
		int max = -1, index = -1;
		
		while(x != 0) {
			int rem = x % 10;
			x /= 10;
			freq[rem]++;
		}
		
		for(int i = 0; i < 10; i++) {
			if(max < freq[i]) {
				max = freq[i];
				index = i;
			}
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitFre(98788987));
	}

}
