import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int sum = 1;
		
		for(int i = 1; i <= size; i++) {
			sum*=i;
		}
		
		System.out.println(sum);
	}
}