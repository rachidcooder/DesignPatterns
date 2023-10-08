package AdapterPattern;

public class MachineOperator {
	 public String Name;
	 public  Double BasicSalary;
	 public String ShiftCode ;
	public String getName() {
		return Name;
	}
	public Double getBasicSalary() {
		return BasicSalary;
	}
	public String getShiftCode() {
		return ShiftCode;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setBasicSalary(Double basicSalary) {
		BasicSalary = basicSalary;
	}
	public void setShiftCode(String shiftCode) {
		ShiftCode = shiftCode;
	}
	 
	 
}
