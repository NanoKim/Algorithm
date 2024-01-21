import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			int count = sc.nextInt();
			for(int j = 0; j< size; j++) {
				if(count == 0) {
					if(arr[j] == 0) {
						arr[j] = i+1;
						break;
					}else {
						continue;
					}
				}else if(arr[j] == 0) {
					count--;
				}
			}
		}
		
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}