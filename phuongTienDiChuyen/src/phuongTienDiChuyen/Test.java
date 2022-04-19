package phuongTienDiChuyen;

public class Test {
	public static void main(String[] args) {
		Manufacturer a = new Manufacturer("ABCD", "American");
		Manufacturer b = new Manufacturer("EFGH", "England");
		Manufacturer c = new Manufacturer("IKMN", "Poland");
		
		Transport mayBay = new Planes("May bay",a, "Dau");
		Transport xeOto = new Car("Xe Oto",b, "xang");
		Transport xeDap = new Bike("May bay",c);
		
		System.out.println("Van toc cua may bay: " + mayBay.speed());
		System.out.println("Van toc cua xe oto: " + xeOto.speed());
		System.out.println("Van toc cua may bay: " + xeDap.speed());
		
	}
}
