import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());

		System.out.println(remainder(a, b, c));
	}

	private static long remainder(long a, long b, long c) {
		if (b == 1) {
			return a % c;
		}
		else {

			long halfVal = remainder(a, b / 2, c);
			if (b % 2 == 1) {
				return (halfVal * halfVal % c) * a % c;
			}
			return halfVal * halfVal % c;
		}
	}
}