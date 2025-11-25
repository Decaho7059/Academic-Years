public class Car implements Vehicule {

	public String honk() {
		// System.out.println();
		return "car";
	}

	// public abstract void honk2();

	public static void main(Integer[] args) {
		System.out.println(args.length);
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}

	public static void main(String[] args) {
		Vehicule e1; // declare
		e1 = new Car(); // instancier
		// e1 = new Vehicule(); // instancier error
		// Car e2 = new Car();
		String s = e1.honk();
		// e1.honk2();

		System.out.println(s == "car"); // vrai
		System.out.println(s.equals("car")); // vrai 


		// System.out.println(args.length);
		// for(int i=0; i<args.length; i++) {
		// 	System.out.println(args[i]);
		// }

	}
}
