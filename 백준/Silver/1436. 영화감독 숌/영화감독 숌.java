import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int number = 666;
		int count = 1;
		
		while(count != n) {
			number++;
			if((number+"").contains("666")) {
				count++;
			}
		}
		System.out.println(number);
	}
}