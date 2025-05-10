package question02;

public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="rap";
		
		if(check(str)) {
			System.out.println(str + " is Palindrome");
		}else {
			System.out.println(str + " ->  is Not a Palindrome");
		}
		

	}
	static boolean check(String str) {
	
		int i=0;
		int j=str.length()-1;
		while(i<=j) {
			if(str.charAt(i) !=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		
	}

}
