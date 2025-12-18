package customizeexception;

public class InvalidTicketNumberException extends Exception {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sorry! Tickets are sold out.";
	}
}
