package test;

import controller.EmployeeController;
import view.EmployeeView;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeController ec=new EmployeeController();
		EmployeeView v=new EmployeeView(ec);
		v.showMenu();
	}

}
