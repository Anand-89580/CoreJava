package question03;

public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="India is my country ";
//		System.out.println(countWords(str));
		System.out.println(word(str));

	}
	
	static int countWords(String str) {
		if(str.length() == 0 ) {
			return 0;
		}
		str.trim();
		int count =str.split("\\s").length;
		
		return count;
	}
	
	static int word(String str) {
		if(str.length() == 0 ) {
			return 0;
		}
		
		str.trim();
		String[] countString = str.split("\\s+");
		return countString.length;
		
	}

}
