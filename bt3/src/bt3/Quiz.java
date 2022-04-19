package bt3;


class Example {
	static int a = 9;
	public int getA() {
		return a;
	}
	
	public void increen() {
		a += 1;
	}
	
	public static int getAStatic() {
		return a;
	}
}

public class Quiz {
	
 public static void main(String[] args) {
	 int result = 0;
	 Example ins = new Example();
	 System.out.println(Example.a);
//	 System.out.println(ins.getAStatic());
//	 System.out.println(Example.getAStatic());
//	 System.out.println(Example.a);
	 ins.increen();
	 Example ins2 = new Example();
	 System.out.println(ins2.getA());
	 
 }
}
