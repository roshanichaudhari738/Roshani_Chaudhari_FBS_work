package customizeexception;

public class InsufficientFeesException extends Exception {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Fees paid is less than 30% of total course fees!";
		}
}
