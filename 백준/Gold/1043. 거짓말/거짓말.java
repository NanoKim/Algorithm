import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	static int[] par;
	static ArrayList<Integer> trues;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = bf.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		par = new int[n + 1];

		trues = new ArrayList<>();
		ArrayList<ArrayList<Integer>> party = new ArrayList<>();
		int cnt = 0;
		
		for(int i = 0; i <= m; i++) {
			party.add(new ArrayList<>());
		}

		for (int i = 0; i <= n; i++) {
			par[i] = i;
		}
		
		str = bf.readLine().split(" ");
		
		int known = Integer.parseInt(str[0]);
		
		if(known == 0) {
			System.out.println(m);
			System.exit(0);
		} else {
			for (int i = 0; i < known; i++) {
				trues.add(Integer.parseInt(str[i + 1]));
			}
		}
		
		
		for(int i = 1; i <= m; i++) {
			str = bf.readLine().split(" ");
			
			int people = Integer.parseInt(str[0]);
			int first = Integer.parseInt(str[1]);
			party.get(i).add(first);

			for(int j = 1; j < people; j++) {
				int next = Integer.parseInt(str[j + 1]);

				union(first, next);
				party.get(i).add(next);
			}
			
		}
		
		for(int i = 1; i <= m; i++) {
			boolean check = true;
			
			for(int next : party.get(i)) {
				if(trues.contains(find(par[next]))) {
					check = false;
					break;
				}
			}
			
			if(check) {
				cnt++;
			}
		}

		bw.write(cnt + "\n");

		bw.flush();
		bw.close();
	}

	public static int find(int x) {
		if(par[x] == x) return x;
		else return find(par[x]);
	}
	
	public static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		
		if(trues.contains(py)) {
			int temp = px;
			px = py;
			py = temp;
		}
		
		par[py] = px; 
	}
	
}