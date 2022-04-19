package quanLySinhVien;


public class Test {
	public static void main(String[] args) {
		Date date1 = new Date(15, 6, 2002);
		Date date2 = new Date(18, 12, 2003);
		Date date3 = new Date(15, 6, 2002);
		
		Lop class1 = new Lop("A", "Su Pham");
		Lop class2 = new Lop("B", "CNTT");
		Lop class3 = new Lop("C", "Kinh Te");
		
		Student student1 = new Student(111, "Kim Ngan", date1, 6.5, class1);
		Student student2 = new Student(222, "Huu Trong", date2, 8.5, class2);
		Student student3 = new Student(333, "TMoney", date3, 2.3, class3);
		
		System.out.println("Chuyen nganh cua sinh vien " + student1.getFullName() + ": " + student1.getMajor());
		System.out.println("Chuyen nganh cua sinh vien " + student2.getFullName() + ": " + student2.getMajor());
		System.out.println("Chuyen nganh cua sinh vien " + student3.getFullName() + ": " + student3.getMajor());
		
		System.out.println("Danh gia nang luc sinh vien");
		System.out.println("Sinh vien " + student1.getFullName() + " : ");
		student1.assessment();
		System.out.println("Sinh vien " + student2.getFullName() + " : ");
		student2.assessment();
		System.out.println("Sinh vien " + student3.getFullName() + " : ");
		student3.assessment();
		
		System.out.println("Kiem tra sinh vien co cung ngay sinh!!");
		System.out.println( student1.getFullName() + " va " + student2.getFullName()+ ": " + student1.sameDOB(student2));
		System.out.println( student1.getFullName() + " va " + student3.getFullName()+ ": " + student1.sameDOB(student3));
		System.out.println( student2.getFullName() + " va " + student3.getFullName()+ ": " + student2.sameDOB(student3));
	}
}
