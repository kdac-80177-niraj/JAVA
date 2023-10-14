package Que2;

public class DiameterNegativeError extends Exception {
	private String message;


	public DiameterNegativeError(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "DiameterNegativeError [message=" + message + "]";
	}
	
	
}
