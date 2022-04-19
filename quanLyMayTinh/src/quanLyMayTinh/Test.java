package quanLyMayTinh;

public class Test {
	public static void main(String[] args) {
		Date date1 = new Date(15,6,2011);
		Date date2 = new Date(22,3,2012);
		
		Country country1 = new Country(123, "American");
		Country country2 = new Country(456, "Poland");
		
		Manufacturer m1 = new Manufacturer("ABC", country1);
		Manufacturer m2 = new Manufacturer("DEF", country2);
		
		Computer computer1 = new Computer(m1, date1, 25000000, 12);
		Computer computer2 = new Computer(m2, date2, 30000000, 24);
		
		System.out.println("May tinh 1 re hon may tinh 2: " + computer1.kiemTraGia(computer2));
		System.out.println("May tinh 2 re hon may tinh 1: " + computer2.kiemTraGia(computer1));
		
		System.out.println("Ten quoc gia san xuat may tinh 1: " + computer1.tenQuocGiaSX());
		System.out.println("Ten quoc gia san xuat may tinh 1: " + computer2.tenQuocGiaSX());
	}
}
