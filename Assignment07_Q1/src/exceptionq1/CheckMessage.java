package exceptionq1;



public class CheckMessage {
	private String message;
	public CheckMessage() {
		// TODO Auto-generated constructor stub
	}
	
	public CheckMessage(String message) {
		this.message=message;	
	}
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message)  throws ExceptionLineTooLong {

			if(message.length() < 81) {
					this.message = message;
			}else {
				throw new ExceptionLineTooLong("Your Message is too long It shoul be less than 80 char");
			}

	} 
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return message;
	}
	
	

}
