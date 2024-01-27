import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] arr = new String[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(int j = 0; j < arr.length; j++) {
			int count = 0;
			int sum = 0;
			
			for(int k = 0; k < arr[j].length(); k++) {
				if(arr[j].charAt(k) == 'O') {
					count++;
				}else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}