import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		for (int i = m; i <= n; i++) {
			if (method(i)) {
				System.out.println(i);
			}
		}
	}
	
	static boolean method(int value) {
		if (value == 1)
			return false;
		for (int i = 2; i <= Math.pow(value, 0.5); i++) {
			if (value % i == 0)
				return false;
		}
		
		return true;
	}
}