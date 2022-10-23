package assignmentTest06;

public class Student implements Human {
	int student;
	
	public Student(int student) {
		this.student = student;
	}
	
	
	@Override
	public void print() {
		System.out.println(student + "세의 학생입니다.");
	}

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}
}
