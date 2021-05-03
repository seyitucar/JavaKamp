
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student ();
		student1.id = 1;
		student1.userId = 1;
		student1.email = "seyit@";
		student1.firstName = "Seyit";
		student1.lasName = "Uçar";
		student1.password = 12345;
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.logIn(student1);
		
		studentManager.subscribe(student1);
		
		InstructorManager instructerManager = new InstructorManager();
		
		instructerManager.add("Ruby");
		
		
		
		


	}

}
