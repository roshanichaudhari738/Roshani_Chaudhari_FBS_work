package customizeexception;

public class InvalidMarksException extends Exception {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Invalid Marks below 0";
	}

}
