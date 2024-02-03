import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt() * 2 - 1;
		int star = 1;
		int blank = size/2;
		
		for(int i = 0; i < size; i++) {
			for(int j = i; j < blank; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < star; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i < size/2) {
				star+=2;
			}else {
				star-=2;
				blank+=2;
			}
		}
	}
}