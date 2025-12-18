package customizeexception;

public class InvalidMovieSelectionException extends Exception {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Invalid Movie Selection! Please choose between 1 to 10.";
		}
}
