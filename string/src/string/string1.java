package string;


public class string1 {
	public static void main(String[] args) {
		String name = "KimNgan22";
		String name1 = "Kim Ngan Tran";
		// Thay the chuoi
		System.out.println(name.replace("Kim", "Tran"));
		// Viet hoa viet thuong
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		// Tim vi tri dau tien cua chuoi con
		System.out.println(name.indexOf("Ngan"));
		System.out.println(name.indexOf("zo"));
		// Kiem tra xau bat dau/ ket thuc 
		System.out.println(name.startsWith("Ngan"));
		System.out.println(name.endsWith("Ngan"));
		// Tach chuoi
		String[] words = name1.split(" ");
		for ( String w : words) {
			System.out.println(w);
		}
		// Lay chuoi con
		System.out.println(name.substring(3, 7));
	}

}
