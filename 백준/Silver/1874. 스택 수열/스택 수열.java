import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> st = new Stack<>();
		
		int N = sc.nextInt();
		int num = 0;
		
		while(N -- > 0) {
			int value = sc.nextInt();
			if(value > num) {
				for(int i = num + 1; i <= value; i++) {
					st.push(i);
					sb.append('+').append('\n');
				}
				num = value;
			}
			
			else if(st.peek() != value) {
				System.out.println("NO");
				return;
			}
			
			st.pop();
			sb.append('-').append('\n');
			
		}
		System.out.println(sb);
	}
}
 