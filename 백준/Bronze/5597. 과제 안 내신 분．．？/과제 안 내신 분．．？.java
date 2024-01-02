import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[30];
		int[] arr2 = new int[28];
		int[] arr3 = new int[2];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt(); 
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr[i] == arr2[j]) {
					break;
				}else if(arr[i] != arr2[j] && j == arr2.length-1){
					count++;
					if(count == 1) {
						arr3[0] = arr[i];
					}else {
						arr3[1] = arr[i];
					}
				}
			}
		}
		
		if(arr3[0] > arr3[1]) {
			System.out.println(arr3[1]);
			System.out.println(arr3[0]);
		}else {
			System.out.println(arr3[0]);
			System.out.println(arr3[1]);
		}
	}
}