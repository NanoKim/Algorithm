import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	int[][] arr = new int[15][15];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 15; i++) {
            arr[0][i] = i;
        }

        
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            int o = sc.nextInt();
            int p = sc.nextInt();
            sb.append(arr[o][p] + "\n");
        } 
        System.out.print(sb);
        
        sc.close();
    }    
}