package question01;

public class Question01 {

	public static void main(String[] args) {
//		StringBuilder str = new StringBuilder("Piyush");
		String str ="Piyush";
//		System.out.println(revString(str));
//		System.out.println(revString2(str));
		System.out.println(revStringbuilder(str));
	}
	
	static String revString(String str) {
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
	
	static String revString2(String str) {
		char[] ch= str.toCharArray();
		int i=0;
		int j=ch.length-1;
		while(i<=j) {
			swap(ch,i,j);
			i++;
			j--;
		}
	   return new String(ch);
	} 
	
	public static void swap(char[] ch, int a,int b) {
		char temp =ch[a];
		ch[a]=ch[b];
		ch[b]=temp;
	}
	
	static String revStringbuilder(String str) {
		 StringBuilder s1 =new StringBuilder(str);
		return s1.reverse().toString();
	}
	
	
	static String revStringBuffer(String str) {
		 StringBuffer s1 =new StringBuffer(str);
		return s1.reverse().toString();
	}
	
	
}
