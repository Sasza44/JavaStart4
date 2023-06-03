package second.level;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		System.out.println("Write width ");
		height = sc.nextInt();
		
		for(int i = 1; i <= height * 2 - 1; i++) {
			if(i <= height) {
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int j = 1; j <= 2 * height - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}