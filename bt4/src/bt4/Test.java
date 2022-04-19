package bt4;

interface IShape1 {
	public double perimeter();
}
interface IShape2 {
	public double area();
}
 class Ret implements IShape1, IShape2 {
	private int h;
	private int w;
	
	public Ret (int h, int w) {
		this.h = h;
		this.w = w;
	}
	public double perimeter() {
		return (h + w) * 2;
	}
	public double area() {
		return h * w;
	}
}
public class Test {
	public static void main(String[] args) {
		Ret r = new Ret(2,3);
		System.out.println("p = " + r.perimeter());
		System.out.println("a = " + r.area());
	}
}
