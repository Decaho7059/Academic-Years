public class Program {
	public static double getBudgets(Person[] persons, int i) {
		double sum = 0;
		// for(int i=0; i<persons.length; i++) {
		// 	sum += persons[i].getBudget();
		// }
		for(Person person: persons) {
			sum += person.getBudget();
		}

		persons[0].setName("p3");
		
		i = 100;
		System.out.println(i); // 100
		
		return sum;
	}

	public static void main(String[] args) {
		Person[] arr = new Person[3];
		arr[0] = new Person("p1", 1, 100.5);
		arr[1] = new Person("p1", 1, 200.5);
		arr[2] = new Person("p1", 1, 300);

		int i = 5;

		System.out.println(getBudgets(arr, i)); // 601
		System.out.println(arr[0].getName()); // p3
		System.out.println(i); // 5

	}
}
