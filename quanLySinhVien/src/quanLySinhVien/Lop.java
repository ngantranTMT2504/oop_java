package quanLySinhVien;

public class Lop {
	private String nameClass;
	private String major;
	
	public Lop() {

	}
	public Lop(String nameClass, String major) {
		this.nameClass = nameClass;
		this.major = major;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
