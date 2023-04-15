
public class Employee {
	 double salary;
	 private String name;
	 private int workHours,workYears;
	
	Employee(int workYears, int workHours,String name,double salary){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.workYears=workYears;
		
		
	}
	public double tax() {
		if(this.salary>=1000) {
			return this.salary*0.03;
		}
		return 0;
	}
	public double bonus() {
		return 30*this.workHours;
			}
	public double increase() {
		int fark=2023-workYears;
		if (fark<10) {
			
			return salary*0.20;
		}
		else if(fark>=10 && fark<=19) {
			return salary*0.15;
		}
		else {
			return salary*0.10;
		}
	}
}

