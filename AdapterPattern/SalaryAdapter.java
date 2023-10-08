package AdapterPattern;

public class SalaryAdapter extends SalaryCalculator {
 private Employer _emp =new Employer();
 
 
	public double CalcSalary(MachineOperator op) {
		_emp.BasicSalary=op.BasicSalary ;
		return super.CalcSalary(_emp);
		
	}

}
