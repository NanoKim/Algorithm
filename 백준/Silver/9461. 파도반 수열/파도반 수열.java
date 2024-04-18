import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Long[] fib = new Long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        fib[0] = 0L;
        fib[1] = 1L;
        fib[2] = 1L;
        fib[3] = 1L;

        while(T --> 0){
            int N = Integer.parseInt(br.readLine());

            sb.append(P(N)).append("\n");
        }

        System.out.println(sb);
        br.close();
    }

    static Long P(int N){

        if(fib[N] == null){
            fib[N] = P(N-2) + P(N-3);
        }

        return fib[N];
    }
}