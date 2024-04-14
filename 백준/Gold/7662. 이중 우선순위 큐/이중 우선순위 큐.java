import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int j = 0; j < k; j++) {
                st = new StringTokenizer(br.readLine(), " ");

                char cmd = st.nextToken().charAt(0);
                int value = Integer.parseInt(st.nextToken());

                if (cmd == 'I') {
                    map.put(value, map.getOrDefault(value, 0) + 1);
                }
                else {
                    if (map.isEmpty()) continue;
                    else {
                        int n = (value == 1) ? map.lastKey() : map.firstKey();
                        if (map.put(n, map.get(n) - 1) == 1) {
                            map.remove(n);
                        }
                    }
                }
            }

            if (map.isEmpty()) sb.append("EMPTY").append('\n');
            else sb.append(map.lastKey()).append(' ').append(map.firstKey()).append('\n');  // 그렇지 않다면 최솟값, 최댓값 저장
        }

        System.out.println(sb);
    }

}