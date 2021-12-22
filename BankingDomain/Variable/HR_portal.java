package Variable;

public class HR_portal {
	
	
    
	public static void main(String[] args) {
		Employee emp1 =new Employee();                      //create object shreya
		emp1.EmployeeName="Shreya Patil";
		emp1.ID =101;
		emp1.Salary =80000;
		emp1.Manager="Chetan Singh";
		
		
		Employee emp2 =new Employee();
		emp2.EmployeeName ="Harhsada Pandit";
		emp2.ID =102;
		emp2.Salary =75000;
		emp2.Manager="Swagat Shinde";
		

		Employee emp3 =new Employee();
		emp3.EmployeeName ="Kavya A";
		emp3.ID =103;
		emp3.Salary =50000;
		emp3.Manager="Pallavi k.P";
		
		
		emp1.employee_detail();
		emp2.employee_detail();
		emp3.employee_detail();
		
	}

}
