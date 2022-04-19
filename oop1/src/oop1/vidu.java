package oop1;

class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age : " + age);
	}
}

public class vidu {
	public static void main(String[] args) {
		Student[] students = new Student[2];
		students[0] = new Student("Ngan", 22);
		students[1] = new Student("Trong", 10);
		
		for(int i = 0; i < 2; i++) {
			students[i].display();
		}
	}

}
