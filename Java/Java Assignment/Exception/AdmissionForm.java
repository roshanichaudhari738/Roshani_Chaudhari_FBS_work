package customizeexception;

public class AdmissionForm {
	String studentName;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	
	public AdmissionForm(String studentName, int age, double percentage, double courseFees, double feesPaid) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.percentage = percentage;
		this.courseFees = courseFees;
		this.feesPaid = feesPaid;
	}
	
	public void validateForm() throws EmptyNameException,UnderageException,InvalidPercentageException,NotFitForAdmissionException,
	FeesNotPaidException,InsufficientFeesException
	{
		if(this.studentName==null || this.studentName.trim().equals(""))
		{
				throw new EmptyNameException();
		}
		else if (this.age<=17) {
				throw new UnderageException();	
		}
		else if(this.percentage<=0 ) 
		{
				throw new InvalidPercentageException();
			
		}
		else if(this.percentage>100)
		{
				throw new InvalidPercentageException();
		}
		else if (this.percentage<35) {
				throw new NotFitForAdmissionException();
		}
		else if (this.feesPaid==0) {
			throw new FeesNotPaidException();
		}
		else if (this.feesPaid<0.30 * this.courseFees) {
			throw new InsufficientFeesException();
		}
		else
		{
			System.out.println("Admission Successful!!");
		}
	}

}
