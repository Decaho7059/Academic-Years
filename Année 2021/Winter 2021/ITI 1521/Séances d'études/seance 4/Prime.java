import java.lang.Math;

public class Prime {
	public static boolean isPrime(int entier) {
		// p <= sqrt p
		if(entier < 2) return false;

		for(int i=2; i <= Math.sqrt(entier); i++) {
			if(entier % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] tab = new int[]{1, 2 , 3, 4, 5 , 6 , 7};

		// int[] tab = new int[7];
		// tab[0] = 1
		
		int[][] m = new int[][]{ {0, 1}, {0, 1} };

		for(int i=0; i<tab.length; i++) {
			System.out.println(" le nombre " + tab[i] + " est " + (isPrime(tab[i])? " premier": " non premier"));
		}
		// <=>
		for(int i: tab) {
			System.out.println(" le nombre " + i + " est " + (isPrime(i)? " premier": " non premier"));
		}

		// class anonyme
		// Hand hand = new Hand() {
		// 	public boolean isRock() {
		// 		return true;
		// 	}

		// 	public boolean isScissor() {
		// 		return true;
		// 	}
			
		// 	public boolean isPaper() {
		// 		return true;
		// 	}
		// };

		// System.out.println(hand.isPaper());
		
		// System.out.println(isPrime(5));
	}

	// isPrime(i)? " premier": " non premier"
	
	// if isPrime(i) {
	// 	return " premier"
	// } else {
	// 	return " non premier"
	// }
}
