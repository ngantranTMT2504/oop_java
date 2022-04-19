package isPowerOfFour;

import java.lang.Math;

public class Test {
	public static boolean isPowerOfFour(long n) {
		return (Math.sqrt(n) % 2 == 0);
	}
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(1099511627776L));
	}

}
