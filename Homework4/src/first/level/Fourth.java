package first.level;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width;
		int height;
		System.out.println("Write width ");
		width = sc.nextInt();
		System.out.println("Write height ");
		height = sc.nextInt();
		
		for(int i = 1; i <= height; i++) {
			if(i == 1 || i == height) {
				for(int j = 1; j <= width; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j = 1; j <= width; j++) {
					if(j == 1 || j == width) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}