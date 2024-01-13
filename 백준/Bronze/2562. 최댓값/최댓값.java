import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(arr[i], max);
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(max == arr[i]) {
				System.out.println(max);
				System.out.println(i+1);
				break;
			}
		}
	}
}