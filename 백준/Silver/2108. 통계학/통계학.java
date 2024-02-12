import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int N = sc.nextInt();
		int[] number = new int[N];
		
		for(int i = 0; i < N ; i++) {
			number[i] = sc.nextInt();
			sum += number[i];
		}
		Arrays.sort(number);
		
		int[] arr= new int[8001];
		
		for(int i = 0; i < N; i++) {
			if(number[i] < 0) {
				arr[number[i] * (-1) + 4000]++;
			}else arr[number[i]]++;
		}
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(count < arr[i]) {
				count = arr[i];
			}
		}
		
		int num = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(count == arr[i]) {
				num++;
			if(i < 4001)list.add(i);
			else if(i > 4000)list.add((-1) * i + 4000);
			}
		}
		Collections.sort(list);
				
		System.out.println(Math.round(sum/N));
		System.out.println(number[N/2]);
		if(num == 1) {
			System.out.println(list.get(0));
		}else if(num > 1) {
			System.out.println(list.get(1));
		}
		
		System.out.println(number[N-1] - number[0]);
	}
}