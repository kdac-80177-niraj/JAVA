package Que1;

public class ExceptionLineTooLong extends RuntimeException {
	private String message;

	public ExceptionLineTooLong() {
	}

	public ExceptionLineTooLong(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [message=" + message + "]";
	}
	
	
	
	
}
