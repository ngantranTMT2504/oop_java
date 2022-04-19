package isSortedArray;

public class Test {
	public static boolean isSortedArray(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i+1])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] a = {25, 1, 33, 32, 30, 48, 23, 1, 19, 32};
		System.out.println(isSortedArray(a));
	}

}
