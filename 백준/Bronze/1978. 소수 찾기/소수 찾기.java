import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			boolean flag = true;
			int num = sc.nextInt();
			
			if(num == 1) {
				continue;
			}
			
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
	}
}