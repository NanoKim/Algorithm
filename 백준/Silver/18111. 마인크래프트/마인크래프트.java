import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer n = Integer.parseInt(st.nextToken());
        Integer m = Integer.parseInt(st.nextToken());
        Integer b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        
        int min = 256;
        int max = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        int min_time = 1000000000;
        int max_height = 0;
        Loop1:
        for (int height = min; height <= max; height++) {
            int countD = 0;
            int countI = 0;
            int num = b;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] < height) {
                    	countI += height - arr[i][j];
                    	num -= height - arr[i][j];
                    } else if (arr[i][j] > height) {
                    	countD += arr[i][j] - height;
                    	num += arr[i][j] - height;
                    }
                }
            }
            if (num < 0) {
                continue Loop1;
            }
            
            int time = countD * 2 + countI;
            
            if (time <= min_time && height >= max_height) {
                min_time = time;
                max_height = height;
            }
        }

        System.out.println(min_time + " " + max_height);
    }
}