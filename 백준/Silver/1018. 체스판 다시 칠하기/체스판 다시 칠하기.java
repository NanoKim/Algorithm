import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int N = sc.nextInt();
	   int M = sc.nextInt();
	   int min = 64;
	   
	   sc.nextLine();
	   
	   String[] arr = new String[N];
	   
	   String[] w = new String[8];
	   String[] b = new String[8];
	   
	   for(int i = 0; i < N; i++) {
		   arr[i] = sc.nextLine();
	   }
	   
	   for(int i = 0; i < 8; i++) {
		   if(i % 2 == 0) {
			   w[i] = "WBWBWBWB";
			   b[i] = "BWBWBWBW";
		   }else {
			   w[i] = "BWBWBWBW";
			   b[i] = "WBWBWBWB";
		   }
	   }
	   
	   for(int i = 0; i < (N-7); i++) {
		   for(int j = 0; j < (M-7); j++) {
			   int countW = 0;
			   int countB = 0;
			   for(int k = 0; k < 8; k++) {
				   for(int l = 0; l < 8; l++) {
					   if(w[k].charAt(l) != arr[k+i].charAt(l+j)) {
						   countW++;
					   }else if(b[k].charAt(l) != arr[k+i].charAt(l+j)){
						   countB++;
					   }
				   }
			   }
			   min = Math.min(min, Math.min(countW, countB));
		   }
	   }
	   System.out.println(min);
   }
}