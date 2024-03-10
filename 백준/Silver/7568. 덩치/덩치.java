import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	 
        int N = sc.nextInt();
        int weight[] = new int[N];
        int height[] = new int[N];
        int rank[] = new int[N];
 
        for (int i = 0; i < N; i++) {
            weight[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
 
        for (int i = 0; i < N; i++) {
 
            int cnt = 1;
            for (int j = 0; j < N; j++) {
                if(i == j) continue;
 
                if(weight[i] < weight[j] && height[i] < height[j]) {
                    cnt += 1;
                }
            }
            rank[i] = cnt;
            cnt = 1;
        }
 
        for (int i = 0; i < N; i++) {
            System.out.print(rank[i] + " ");
        }
        sc.close();
    }
    
}