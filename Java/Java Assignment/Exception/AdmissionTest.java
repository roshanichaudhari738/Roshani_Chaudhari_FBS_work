package customizeexception;

public class AdmissionTest {

	public static void main(String[] args) {
		AdmissionForm af=new AdmissionForm("Roshani",18, 60, 23000, 10000);
		try {
			af.validateForm();
		} 
		catch (EmptyNameException en) {
			System.out.println(en);
		}
		catch (UnderageException ue) {
			System.out.println(ue);
		}
		catch (InvalidPercentageException ie) {
			System.out.println(ie);
		}
		catch (NotFitForAdmissionException nfe) {
			System.out.println(nfe);
		}
		catch (FeesNotPaidException fne) {
			System.out.println(fne);
		}
		catch (InsufficientFeesException ife) {
			System.out.println(ife);
		}

	}

}
