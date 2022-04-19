
public class Test {
	public static int circleRotation(int[] arr, int d)
	{
		if(d < arr.length) {
			return arr[d];
		} else {
			int viTri = d % arr.length;
			return arr[viTri];
		}
	}
	public static void main(String[] args) {
		int[] a = {1,5,1,2,2};
		System.out.println(circleRotation(a, 3));
	}
}
