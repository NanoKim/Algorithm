import java.io.*;
import java.util.*;

public class Main {

	static int N, M;
	static int[][] arr;
	static boolean[][] check;
	static int[] moveX = { 0, 0, 1, -1 };
	static int[] moveY = { 1, -1, 0, 0 };
	static Queue<point> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		arr = new int[N][M];
		check = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(s[j]);
			}
		}

		check[0][0] = true;
		bfs(0, 0);
		System.out.println(arr[N - 1][M - 1]);

		br.close();

	}// main()

	public static void bfs(int x, int y) {

		q.add(new point(x, y));

		while (!q.isEmpty()) {
			point s = q.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = s.x + moveX[i];
				int nextY = s.y + moveY[i];

				if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
					continue;
				}
				if (check[nextX][nextY] || arr[nextX][nextY] == 0) {
					continue;
				}
				q.add(new point(nextX, nextY));
				arr[nextX][nextY] = arr[s.x][s.y] + 1;
				check[nextX][nextY] = true;
			}
		}
	}

}// bfs()

class point {
	int x;
	int y;

	point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}