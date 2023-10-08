package AdapterPattern;

public class SalaryCalculator {
	
	public double CalcSalary(Employer emp) {
		return emp.BasicSalary*1.5 ;
	}

}
