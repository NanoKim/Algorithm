import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int exam = sc.nextInt();
		char ch;
		
		if(exam > 89) {
			ch = 'A';
		}else if(exam > 79) {
			ch = 'B';
		}else if(exam > 69) {
			ch = 'C';
		}else if(exam > 59) {
			ch = 'D';
		}else {
			ch = 'F';
		}
		System.out.println(ch);
	}
}