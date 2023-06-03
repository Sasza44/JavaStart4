package first.level;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int columns;
		System.out.println("Write number of columns ");
		columns = sc.nextInt();
		int rows = 5;
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= columns; j++) {
				if(j % 2 != 0) {
					System.out.print("***");
				}
				else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
	}
}