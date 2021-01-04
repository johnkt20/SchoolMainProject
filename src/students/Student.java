package students;

public class Student {
 private int sudentId;
 private static String studentName;
public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("hello student");
      System.out.println("StudentName:"+ getStudentName());
	}
	public int getSudentId() {
		return sudentId;
	}
	public void setSudentId(int sudentId) {
		this.sudentId = sudentId;
	}
	public static String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
