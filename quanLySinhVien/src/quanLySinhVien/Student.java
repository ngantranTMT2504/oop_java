package quanLySinhVien;

public class Student {
	private int studentCode;
	private String fullName;
	private Date dob;
	private double score;
	private Lop studentclass;
	
	public Student(int studentCode, String fullName, Date dob, double score, Lop studentclass) {
		this.studentCode = studentCode;
		this.fullName = fullName;
		this.dob = dob;
		this.score = score;
		this.studentclass = studentclass;
	}

	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getCore() {
		return score;
	}

	public void setCore(double score) {
		this.score = score;
	}

	public Lop getStudentclass() {
		return studentclass;
	}

	public void setStudentclass(Lop studentclass) {
		this.studentclass = studentclass;
	}
	public String getMajor() {
		return this.studentclass.getMajor();
	}
	public void assessment() {
		if(this.score >= 5) {
			System.out.println("Pass!!");
		} else {
			System.out.println("Fail!!");
		}
	}
	public boolean sameDOB(Student other) {
		return this.dob.equals(other.dob);
	}
	
}
