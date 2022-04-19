
public class Test {
	public static void main(String[] args) {
		Date day1 = new Date(6, 9, 2019);
		Date day2 = new Date(11, 2, 2016);
		Date day3 = new Date(19, 7, 2017);
		
		Studio studio1 = new Studio("Disney", "Englend");
		Studio studio2 = new Studio("Pixax", "American");
		Studio studio3 = new Studio("Vina", "VietNamese");
		
		Movie a = new Movie("Bo Gia", 2015, studio1, 48000, day1);
		Movie b = new Movie("Gau Truc Do", 2017, studio2, 52000, day2);
		Movie c = new Movie("Bong De", 2010, studio3, 47000, day3);
		
		System.out.println("Gia ve cua "+a.getName()+" re hon "+ c.getName()+" : " + a.cheaper(c));
		System.out.println("Gia ve cua "+a.getName()+" re hon "+ b.getName()+" : " + a.cheaper(b));
		System.out.println("Gia ve cua "+b.getName()+" re hon "+ c.getName()+" : " + b.cheaper(c));
		
		System.out.println("Ten hang phim cua " + a.getName() + ": " + a.getNameStudio());
		System.out.println("Ten hang phim cua " + b.getName() + ": " + b.getNameStudio());
		System.out.println("Ten hang phim cua " + c.getName() + ": " + c.getNameStudio());
		
		System.out.println("Gia ve phim " + a.getName() + " sau khi giam: " + a.lastPrice(15));
		System.out.println("Gia ve phim " + b.getName() + " sau khi giam: " + b.lastPrice(15));
		System.out.println("Gia ve phim " + c.getName() + " sau khi giam: " + c.lastPrice(15));
	}
}
