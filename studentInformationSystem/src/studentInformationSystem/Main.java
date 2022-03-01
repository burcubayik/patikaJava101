package studentInformationSystem;

public class Main {

	public static void main(String[] args) {
	Course course1= new Course("Matematik", "MAT101", "MAT");
	Course course2= new Course("Fizik", "FZK101", "FZK");
	Course course3= new Course("Kimya", "KMY101", "KMY");
	
	Teacher teacher1= new Teacher("Koray","Kahraman","5555555","MAT");
	Teacher teacher2= new Teacher("Tülin","Akkaya","5555555","FZK");
	Teacher teacher3= new Teacher("Mehmet Ali","Albayrak","5555555","KMY");
	course1.addTeacher(teacher1);
	course2.addTeacher(teacher2);
	course3.addTeacher(teacher3);
	Student student1=  new Student("Burcu","Bayýk","1111",4,course1,course2,course3);
	student1.addBulkExamNote(100, 90, 80, 70,90, 80);
	student1.isPass();
	
	

	}

}
