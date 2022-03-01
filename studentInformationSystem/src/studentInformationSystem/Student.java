package studentInformationSystem;

public class Student {
	String firstName;
	String lastName;
	String studentNumber;
	int classes;
	int mathScoreSoz;
	int mathScoreYaz;
	int physicsScoreSoz;
	int physicsScoreYaz;
	int chemistryScoreSoz;
	int chemistryScoreYaz;
	double average;
	boolean isPass;
	
	public Student(String firstName, String lastName, String studentNumber, int classes , Course course1, Course course2, Course course3) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
		this.classes = classes;
	}
	public void addBulkExamNote(int mathScoreSoz, int mathScoreYaz, int physicsScoreSoz, int physicsScoreYaz, int chemistryScoreSoz, int chemistryScoreYaz) {
		if(mathScoreSoz>0 && mathScoreSoz<=100) {
			this.mathScoreSoz=mathScoreSoz;
		}
		
		if(mathScoreYaz>0 && mathScoreYaz<=100) {
			this.mathScoreYaz=mathScoreYaz;
		}
		if(physicsScoreSoz>0 && physicsScoreSoz<=100) {
			this.physicsScoreSoz=physicsScoreSoz;
		}
		if(physicsScoreYaz>0 && physicsScoreYaz<=100) {
			this.physicsScoreYaz=physicsScoreYaz;
		}
		if(chemistryScoreSoz>0 && chemistryScoreSoz<=100) {
			this.chemistryScoreSoz=chemistryScoreSoz;
		}
		if(chemistryScoreYaz>0 && chemistryScoreYaz<=100) {
			this.chemistryScoreYaz=chemistryScoreYaz;
		}
		
	}
	public double calculateAverage() {
		this.average=(this.mathScoreSoz*0.2+this.mathScoreYaz*0.8+
				this.physicsScoreSoz*0.2+this.physicsScoreYaz*0.8+
				this.chemistryScoreSoz*0.2+this.chemistryScoreYaz*0.8)/3;
		return this.average;
	}
	
	public void printNote() {
		System.out.println("-----");
		System.out.println("Öðrenci: "+ this.firstName+ " "+ this.lastName);
		System.out.println("Matematik Sözlü Notu: "+ this.mathScoreSoz 
				+"\nMatematik Yazýlý Notu: "+ this.mathScoreYaz);
		System.out.println("Fizik Sözlü Notu: "+ this.physicsScoreSoz 
				+"\nFizik Yazýlý Notu: "+ this.physicsScoreYaz);
		System.out.println("Kimya Sözlü Notu: "+ this.chemistryScoreSoz 
				+"\nKimya Yazýlý Notu: "+ this.chemistryScoreYaz);
		
	}
	public void isPass() {
		if( mathScoreSoz==0|| mathScoreYaz==0|| physicsScoreSoz==0|| physicsScoreYaz==0
				|| chemistryScoreSoz==0|| chemistryScoreYaz==0) {
			System.out.println("Notlarýn tamamý sisteme girilmemiþtir!");
			
		}
		else {
			System.out.println("Ortalama: "+calculateAverage());
			this.isPass=isCheckPass();
			if(this.isPass) {
				System.out.println(this.firstName+ " "+ this.lastName+" isimli öðrenci sýnýfý geçti!");
				
			}
			else {
				System.out.println(this.firstName+ " "+ this.lastName+" isimli öðrenci maalesef sýnýfta kaldý!");
			
			}
		}
		
	}
	public boolean isCheckPass() {
		calculateAverage();
		return this.average>55;
	}

}
