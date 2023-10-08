package AdapterPattern;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Employer emp=new Employer();
   MachineOperator op=new MachineOperator();
    op.BasicSalary=1700.00;
     
     SalaryAdapter salaryAdp=new SalaryAdapter();
     
    double salary = salaryAdp.CalcSalary(op) ;
    
     System.out.println("Machine operator salary : "+salary);
	} 

}
