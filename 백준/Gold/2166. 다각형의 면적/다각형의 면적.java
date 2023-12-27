import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		long[] x = new long[size+1];
		long[] y = new long[size+1];
		double sum = 0;
		
		for(int i = 0; i < size; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		x[size] = x[0];
		y[size] = y[0];
		
		for(int i = 0; i < size; i++) {
			sum+=(x[i]*y[i+1] - (x[i+1]*y[i]));
		}
		
		System.out.printf("%.1f", Math.abs(sum)/2.0);
	}
}