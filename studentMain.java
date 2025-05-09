package Com.Example;

public class studentMain {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentDetails("ABC", 101, 85.5);
		String res = student.getStudentDetails();
		System.out.println(res);
		
	}
}
