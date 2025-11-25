// import java.util.StringTokenizer;
import java.util.*;
import javax.swing.*;
import java.io.*;


public class Shuffle {
	public static String inverse(String nom) {

		if(nom == null || nom.length() == 0) {
			System.out.println("entree non valide");
			return null;
		}
		
		StringTokenizer st = new StringTokenizer(nom);

		// System.out.println(st.countTokens());

		if(st.countTokens() == 2) {
			// faire travail
			// "rochard bozac"
			// ["rochard", "bozac"]
			// i
			// t[i++]
			String n1 = st.nextToken(); // "rochard"
			String n2 = st.nextToken(); // "bozac"

			return n2 + " " + n1;
		} else {
			System.out.println("entree non valide");
			return null;			
		}
	}

	public static String inverse2(String nom) {

		if(nom == null || nom.length() == 0) {
			System.out.println("entree non valide");
			return null;
		}

		String[] array = nom.split(" ");
		
		if(array.length == 2) {
			// faire travail
			// "rochard bozac"
			// ["rochard", "bozac"]
			//     0          1
			// i
			// t[i++]
			String n1 = array[0]; // "rochard"
			String n2 = array[1]; // "bozac"

			return n2 + " " + n1;

		} else {
			System.out.println("entree non valide");
			return null;			
		}
	}	

	public static String inverse3(String nom) throws Exception {

		if(nom == null || nom.length() == 0) {
			throw new Exception("msg");
			System.out.println("entree non valide");
			return null;
		}

		String[] array = nom.split(" ");
		
		// faire travail
		// "rochard bozac"
		// ["rochard", "bozac"]
		//     0          1
		// i
		// t[i++]

		String s = "";

		for(int i=array.length - 1; i >= 0 ; i--) {
			s = s + array[i] + " ";
		}

		return s;
	}

	public static void main(String[] args) throws Exception {
		// inverse(null);
		// inverse("");
		
		// System.out.println(inverse("rochard bozac"));
		// System.out.println(inverse2("rochard bozac"));
		
		// System.out.println(args[0]);
		// System.out.println(inverse3("rochard bozac ch ab"));
		
		// String s = JOptionPane.showInputDialog(null, "get input");

		try {

			Scanner scanner = new Scanner(new File("./input.txt"));  // Create a Scanner object

			System.out.println("Enter username");

			String userName = scanner.nextLine();  // Read user input
			System.out.println("Username is: " + userName);  // Output user input

		} catch (Exception e) {

		}
		
		// Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		// System.out.println(inverse3(s));

		// inverse2("rochard bozac");
	}
}
