package customizeexception;

public class NotFitForAdmissionException extends Exception {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Less than 35 percent is not fit for admission";
		}
}
