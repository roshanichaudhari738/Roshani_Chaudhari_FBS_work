package customizeexception;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarks s1=new StudentMarks(1, "Roshani", 80);
		try {
			s1.calculateMarks();
		}
		catch(InvalidMarksException ime)
		{
			System.out.println(ime);
		}
		catch (InvalidMarksException1 e) {
			System.out.println(e);
		}
		

	}

}
