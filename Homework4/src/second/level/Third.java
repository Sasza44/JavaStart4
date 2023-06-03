package second.level;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width;
		System.out.println("Write width (odd number) ");
		width = sc.nextInt();
		
		for(int i = 1; i <= width; i++) {
			int x = 0;  // найменша кількість пробілів
			int x1 = 0; // кількість пробілів від верхнього краю
			int x2 = 0; // кількість пробілів від нижнього краю
			x1 = i - 1;
			x2 = width - i;
			if(x1 >= x2) {
				x = x2;
			}
			else {
				x = x1;
			}
			for(int j = 1; j <= x; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= width - 2 * x; j++) {
				System.out.print("*");
			}
			x = 0;
			x1 = 0;
			x2 = 0;
			System.out.println();
		}
	}
}