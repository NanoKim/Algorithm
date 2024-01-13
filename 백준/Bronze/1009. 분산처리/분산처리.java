import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int test = sc.nextInt();
	   
	   for(int i = 0; i < test; i++) {
		   int a = sc.nextInt();
		   int b = sc.nextInt();
		   int answer = 1;
		   
		   if(a % 10 == 0) {
			   answer = 10;
			   System.out.println(answer);
			   continue;
		   }
		   
		   answer = a % 10;
		   for(int j = 1; j < b; j++) {
			   answer = (answer * a) % 10;
		   }
		   System.out.println(answer);
	   }
   }
}