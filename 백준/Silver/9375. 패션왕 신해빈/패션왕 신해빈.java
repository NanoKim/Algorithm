import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> wear = new HashMap<>();
            int[] count = new int[N];
            int num = 0;
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = st.nextToken();
                if (wear.containsKey(kind)) count[wear.get(kind)]++;
                else {
                    wear.put(kind, num);
                    count[num++] = 2;
                }
            }
            int result = 1;
            for (int j = 0; j < num; j++) {
                result *= count[j];
            }
            sb.append(result - 1).append("\n");
        }
        System.out.println(sb);
    }
}