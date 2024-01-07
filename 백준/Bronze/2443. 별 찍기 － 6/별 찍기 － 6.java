import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int star = 1;
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*size-star; k++) {
				System.out.print("*");
			}
			star+=2;
			System.out.println();
		}
	}
}