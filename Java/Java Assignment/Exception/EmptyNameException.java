package customizeexception;

public class EmptyNameException extends Exception {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Name cant empty or null";
		}
}
