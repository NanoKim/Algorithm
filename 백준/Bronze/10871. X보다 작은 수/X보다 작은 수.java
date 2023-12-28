import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(num < x) {
				arr[i] = num;
			}
		}
		
		for(int i = 0; i < n; i++) {
            if(arr[i] != 0){
                System.out.print(arr[i] + " ");
            }
		}
	}
}