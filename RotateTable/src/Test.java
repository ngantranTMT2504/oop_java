
public class Test {
	public static int rotateTable(int a, int b, int c, int d) {
		double[] arr = new double[4];
		double adouble = a;
		double bdouble = b;
		double cdouble = c;
		double ddouble = d;
		
		
		arr[0] = adouble / cdouble - bdouble / ddouble; // giá trị sau lần quay 1
		arr[1] = cdouble / ddouble - adouble / bdouble; // giá trị sau lần quay 2
		arr[2] = ddouble / bdouble - cdouble / adouble; // giá trị sau lần quay 3
		arr[3] = bdouble / adouble - ddouble / cdouble; // giá trị sau lần quay 4
		double max = arr[0];
		int place = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				place = i;
			}
		}
		return place;
	}
	public static void main(String[] args) {
		System.out.println(rotateTable(5,6,7,10));
	}

}
