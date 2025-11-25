//Q3
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre positif: ");
        int n = scanner.nextInt();
        System.out.println(factorial(n));

    }
    public static int factorial(int n ){
        int prod = 1;
        for (int i=1; i <= n; i++){
            prod = prod *(i);
        }
        return prod;
    }
}
