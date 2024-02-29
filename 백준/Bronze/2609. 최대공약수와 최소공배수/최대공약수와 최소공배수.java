import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int mul = a * b;
		
		while (b != 0) {
			a = a % b;
			int temp = a;
			a = b;
			b = temp;
		}
		
		System.out.println(a);
		System.out.println((int) mul / a);
    }    
}