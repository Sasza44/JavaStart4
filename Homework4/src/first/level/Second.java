package first.level;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Write number ");
		n = sc.nextInt();
		int fac = 1;
		
		// обчислення факторіалу числа
		for(int i = n; i >= 1; i--) {
			fac *= i;
		}
		System.out.println("Factorial= " + fac);
	}
}