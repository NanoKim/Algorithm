import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = 0;
		int[] arr = new int[n];
		Integer[] arr2 = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		
		Arrays.sort(arr2, Collections.reverseOrder());
		
		for(int i = 0; i < n; i ++) {
			result += arr[i] * arr2[i];
		}
		
		System.out.println(result);
	}
}