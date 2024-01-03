import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int a = Integer.parseInt(str,16);
		System.out.println(a);
	}
}