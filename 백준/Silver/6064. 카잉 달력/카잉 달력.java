import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());


        for (int i = 0; i < n; i++) {

            String[] temp = in.readLine().split(" ");
            int N = Integer.parseInt(temp[0]);
            int M = Integer.parseInt(temp[1]);
            int x = Integer.parseInt(temp[2]);
            int y = Integer.parseInt(temp[3]);

            sb.append(getYear(N, M, x, y) + "\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }

    private static int getYear(int N, int M, int x, int y) {
        int minMul = 0;
        for (int i = 1;; i++) {
            if ((M * i) % N == 0) {
                minMul = M * i;
                break;
            }
        }

        for (int i = x; i <= minMul; i += N) {
            if ((i - y) % M == 0) {
                return i;
            }
        }
        
        return -1;
    }
}