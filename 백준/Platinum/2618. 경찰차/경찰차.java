import java.io.*;
import java.util.*;
 
public class Main {
    static int[][] accident, p;
    static int N, W;
	
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
        StringTokenizer st;
		
        N = Integer.parseInt(sc.nextLine());
        W = Integer.parseInt(sc.nextLine());
		
        accident = new int[1001][2];
        p = new int[1001][1001];
		
        for (int i=1; i<=W; i++) {
            st = new StringTokenizer(sc.nextLine());
			
            accident[i][0] = Integer.parseInt(st.nextToken());
            accident[i][1] = Integer.parseInt(st.nextToken());
        }
 
        System.out.println(search(1, 0, 0));
		
        int first = 0;
        int second = 0;
        for (int i = 1; i <= W; i++) {
            int length = size(1, first, i);
			
            if (p[first][second] - length == p[i][second]) {
            	first = i;
                System.out.println(1);
            } else {
            	second = i;
                System.out.println(2);
            }
        }
    }
	
    public static int search (int num, int num1, int num2) {
    
        if (num > W) return 0;
        
        if (p[num1][num2] != 0) return p[num1][num2]; 
		
        int a = search(num+1, num, num2) + size(1, num1, num);
        int b = search(num+1, num1, num) + size(2, num2, num);
		
        return p[num1][num2] = Math.min(a, b); 
    }
	
    public static int size(int type, int start, int end) {
        int[] sp = accident[start];
        int[] ep = accident[end];
		
        if (start == 0) {
            if (type == 1) sp = new int[] {1, 1}; 
            else sp = new int[] {N, N};
        }
		
        return Math.abs(sp[0] - ep[0]) + Math.abs(sp[1] - ep[1]);
    }
}