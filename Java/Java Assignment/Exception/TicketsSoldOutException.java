package customizeexception;

public class TicketsSoldOutException extends Exception {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Requested tickets exceed available tickets!";
		}
}
