
public class Student extends User {
	int id;
	int userId;
	String firstName;
	String lasName;
	
	public Student () {
		
	}

	public Student(int id, int userId, String firstName, String lasName) {
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lasName = lasName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasName() {
		return lasName;
	}

	public void setLasName(String lasName) {
		this.lasName = lasName;
	}
	
	
}
