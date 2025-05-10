package question01;




public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {55,22,5,23,89,41};
				
		 
		System.out.println("Minimum number is " +minNumb(arr));
		

	}
	
	public static <T extends Comparable<T> > T minNumb(T[] arr) {
		T  min = arr[0];		 
		 for(T ele : arr) {
			 if(ele.compareTo(min) < 0) {
				 min=ele;
			 }
		 }
		 return min;
	}
	

	

}
