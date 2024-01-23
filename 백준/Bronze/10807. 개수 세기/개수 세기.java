import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int count = 0;
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int search = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
			if(search == arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}