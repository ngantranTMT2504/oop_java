package btDauTien;

import java.util.Scanner;

class Student {
	String name;
	int age;
	
	public void display() {
		System.out.println ("Name: " + name);
		System.out.println ("Age: " + age);
	}
	public void getInformation() {
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		age = sc.nextInt();
	}
}
public class Test {
	public static void main(String[] args) {
		Student a = new Student();
		a.getInformation();
		a.display();
	}

}
