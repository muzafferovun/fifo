package fifo;

public class Student {
	int id;
	String name;
	Student student;
	public Student() {
		super();
		this.id = -1;
		this.name = "";
		this.student=null;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.student=null;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
