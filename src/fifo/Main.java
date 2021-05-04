package fifo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student=StudentManager.addStudent(student,"muzaffer");
		student=StudentManager.addStudent(student,"Ahmet");
		student=StudentManager.addStudent(student,"Mustafa");
		student=StudentManager.addStudent(student,"Sinan");
		student=StudentManager.addStudent(student,"Emrah");
		StudentManager.showStudents(student);
		student=StudentManager.deleteById(student,3);
		student=StudentManager.deleteById(student,6);
		student=StudentManager.update(student, 8,"Halil İbrahim");
		StudentManager.showStudents(student);
		
	}

}
