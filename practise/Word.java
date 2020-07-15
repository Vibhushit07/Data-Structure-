package practise;

public class Word {
	
	static String word(String str) {
		
		String s[] = str.split(" ");
		
		if(s.length < 2) {
			return "String is not having 2nd word";
		} 
		
		return s[1].toUpperCase();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(word("hello everyone"));
		System.out.println(word("hello"));
	}

}
