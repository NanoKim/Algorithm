import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int count = 0;
	   int test = sc.nextInt();
	   sc.nextLine();
	   
	   for(int i = 0; i < test; i++) {
		   if(check(sc.nextLine())) {
			   count++;
		   }
	   }
	   System.out.println(count);
   }
   
   static boolean check(String str) {
	   boolean[] alphabet = new boolean[26];
	   
	   for(int i = 0; i < str.length(); i++) {
		   int now = str.charAt(i);
		   int prev = (i > 0) ? str.charAt(i - 1) : 0;
		   
		   if(alphabet[now - 'a'] == false) {
			   alphabet[now - 'a'] = true;
		   }else if(now != prev) {
			   return false;
		   }
	   }
	   return true;
   }
}