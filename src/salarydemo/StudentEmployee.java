package salarydemo;

public class StudentEmployee extends HourlyEmployee {

	/**
	 * 
	 * @param name
	 * @param wage
	 */
	public StudentEmployee(String name, double wage) {
		// TODO - implement StudentEmployee.StudentEmployee
            super(name, wage);	
                
	}

	/**
	 * 
	 * @param hoursWorked
	 */
	public double weeklyPay(int hoursWorked) {
		// TODO - implement StudentEmployee.weeklyPay  
		return super.weeklyPay(hoursWorked);
	}

}