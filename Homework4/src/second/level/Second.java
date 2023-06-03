package second.level;

public class Second {

	public static void main(String[] args) {
		System.out.println(2);
		for(int i = 3; i <= 100; i++) {
			boolean x = false; // бітова змінна, за допомогою якої ловимо хоч одне непросте число
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					x = true;
				}
			}
			if(x != true) {
				System.out.println(i);
			}
			x = false;
		}
	}
}