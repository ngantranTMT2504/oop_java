package chuViDienTichHCN;

import java.util.Scanner;

class Rectangle {
	 double length;
	 double width;
	
	public void getInformation() {
		Scanner sc = new Scanner(System.in);
		length = sc.nextDouble();
		width = sc.nextDouble();
	}
	public void display() {
		System.out.println("Perimeter: " + (length * width));
		System.out.println("Area: " + (length + width)*2);
	}
}

public class Test {
	public static void main(String[] args) {
		Rectangle a = new Rectangle();
		a.getInformation();
		a.display();
	}

}
