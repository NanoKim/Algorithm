import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			int x, y, count = 0;
			
			y = sc.nextInt();
			x = sc.nextInt();
			count = sc.nextInt();
			
			for(int j = 1; j <= x; j++) {
				if(y * j < count) {
					continue;
				}else if(y * j > count){
					arr[i] = (count % y)*100 + j;
					break;
				}else if(y * j == count) {
					arr[i] = (y*100) + j;
					break;
				}
			}
		}
			
		for(int v : arr) {
			System.out.println(v);
		}
	}
}