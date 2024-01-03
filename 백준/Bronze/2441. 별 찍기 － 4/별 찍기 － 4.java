import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		String blank = " ";
		
		for(int i = 0; i < size; i++) {
			if(i > 0) {
				for(int k = 0; k < i; k++) {
					System.out.print(blank);
				}
			}
			for(int j = size; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}