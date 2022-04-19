package isSemiPrime;

import java.lang.Math;

public class Test {
	public static boolean prime(int n) {
		int count = 0;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				count++;
				break;
			}
		}
		if(count != 0) {
			return false;
		}
		return true;
	}
	public static boolean isSemiPrime(int n) {
		for(int i = 2; i <= n/2; i++) {
			if(prime(i) == true){
				if(n % i == 0) {
				n = n/i;
				for(int j = i; j <= n; j++) {
					if((prime(j) == true && (n % j) ==0) && n/j == 1){
						return true;
				}
				}
			}
		}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isSemiPrime(961));
	}

}
