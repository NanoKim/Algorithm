import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		int a;
		int b;
		
		for(int i = 0; i < arr.length; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i] = a+b;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}