package fifo;

public class StudentManager {
	public static Student addStudent(Student student,String name) {
		if(student==null) {
			student=new Student(1,name);
		}
		else if(student.getId()==-1) {
			student=new Student(1,name);
			
		}
		else {
			
			student.student=StudentManager.addStudent(student.student, name,student.getId()+1);
		}
	
		return student;
	
	}
	public static Student addStudent(Student student,String name,int id) {
		if(student==null) {
			student=new Student(id,name);
		}
		else if(student.getId()==-1) {
			student=new Student(id+1,name);
			
		}
		else {
			
			student.student=StudentManager.addStudent(student.student, name,id+1);
		}
	
		return student;
	
	}
	
	
	public static void showStudents(Student student) {
		if(student==null) {
		}
		else if(student.getId()==-1) {
			
		}
		else {
			System.out.println(student.getId()+"->"+student.getName());	
			StudentManager.showStudents(student.student);
		}
	}
	public static Student deleteById(Student student, int id) {
		if(student!=null) {
			if(student.getId()==id) {
					return student.getStudent();
			}
			else {
				if(student.student!=null) {
					if(student.student.getId()>-1)	student.setStudent(StudentManager.deleteById(student.student,id));
				}
			}
		}
		return student;
}
	public static Student update(Student student, int id,String name) {
		if(student!=null) {
		
			if(student.getId()==id) {
					student.setName(name);
					return student;
			}
			else {
				if(student.student!=null) {
					student.setStudent(StudentManager.update(student.student,id,name));
				}
			}
		}
		return student;
}

}
