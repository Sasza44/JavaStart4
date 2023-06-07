package second.level;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height;
		System.out.println("Write width ");
		height = sc.nextInt();
			
		int starNum = 0; // кількість зірочок
		int starNumInRow = 1; // кількість зірочок в ряду
		int rowNum = 0; // кількість рядів
		while(rowNum != 2 * height - 1) {
			starNum += 1;
			System.out.print("*");
			if(rowNum < height - 1) {
				if(starNum == starNumInRow) {
					System.out.println();
					rowNum += 1;
					starNumInRow += 1;
					starNum = 0;
				}
			}
			else {
				if(starNum == starNumInRow) {
					System.out.println();
					rowNum += 1;
					starNumInRow -= 1;
					starNum = 0;
				}
			}
		}
	}
}