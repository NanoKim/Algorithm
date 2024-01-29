import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		while(size-- != 0) {
			int count = sc.nextInt();
			String str = sc.next();
			
			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < count; j++) {
					System.out.print(str.charAt(i));;
				}
			}
			System.out.println();
		}
	}
}