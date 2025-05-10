package exceptq2;

public class CustomException extends Exception{
	private String message;

	public CustomException() {
		// TODO Auto-generated constructor stub
	}
	
	public CustomException(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception Occured : " + message;
	}

}
