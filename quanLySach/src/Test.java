
public class Test {
	public static void main(String[] args) {
		Year daya = new Year(16,7, 2001);
		Year dayb = new Year(19,5,1999);
		Year dayc = new Year(25,6, 2021);
		
		Author author1 = new Author("Tmoney", dayb);
		Author author2 = new Author("Trong", daya);
		Author author3 =  new Author("NguyenVanA", dayc);
		
		Book book1 = new Book("Lap trinh can ban", 80000, 2023, author1);
		Book book2 = new Book("Lap trinh web" , 52000, 2010, author3);
		Book book3 = new Book("Nau an ngon", 16700, 2023, author2);
		
		book1.nameOfBook();
		book2.nameOfBook();
		book3.nameOfBook();
		
		System.out.println("Kiem tra nxb sach 1 va sach 3 : " + book1.sameYear(book3));
		
		System.out.println("Gia sach sau khi giam gia");
		
		System.out.println("Sach 1 : " + book1.lastPrice(45));
		System.out.println("Sach 2 : " + book2.lastPrice(10));
		System.out.println("Sach 3 : " + book3.lastPrice(25));
	}
}
