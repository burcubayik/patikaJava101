package salaryCalculator;

public class Employee {
	String name;
	int salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	public double tax(){
		
		
		if(this.salary>=1000) {
			return this.salary*0.03;
		
		}
		
		return 0;
		
	}
	public int bonus() {
		
		if(this.workHours>40) {
			return (this.workHours-40)*30;
			
		}
		return 0;
	}
	public double riseSalary() {
		int workingYear= 2021-this.hireYear;
		if(workingYear<10) {
			return this.salary*0.05;
		}
		if(workingYear>9&& workingYear<20) {
			return this.salary*0.1;
		}
		if(workingYear>19) {
			return this.salary*0.15;
		}
		return 0;
	}
	public String toString() {
		double netSalary= this.salary-tax()+ bonus()+ riseSalary();
		return "Adý : "+this.name
				+"\nMaaþý : "+this.salary
				+"\nBaþlangýç Yýlý : "+ this.hireYear
				+"\nVergi : "+tax()
				+"\nBonus : "+bonus()
				+"\nMaaþ Artýþý : "+ riseSalary()
				+"\nVergi ve bonuslar ile maaþ : "+(this.salary-tax()+ bonus())
				+"\nToplam Maaþ : "+ netSalary;
		
		
	}
	

}
