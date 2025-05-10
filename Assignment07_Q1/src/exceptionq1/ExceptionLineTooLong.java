package exceptionq1;



public class ExceptionLineTooLong extends Exception {

	private String exmessage;
	
	public ExceptionLineTooLong() {
		
	}
	
	public ExceptionLineTooLong(String message) {
		this.exmessage=message;
	}
	
	public void setExMessage(String message) {
		this.exmessage = message;
	}
	
	public String getExMessage() {
		return exmessage;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception occured : "+exmessage;
	}
	

	
}
