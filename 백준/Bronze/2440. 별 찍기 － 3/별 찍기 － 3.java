import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
			for(int j = size; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}