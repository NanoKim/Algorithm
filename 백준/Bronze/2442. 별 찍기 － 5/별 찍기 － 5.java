import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		for(int i = 1; i <= size; i++) {
			for(int j = i; j < size; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}