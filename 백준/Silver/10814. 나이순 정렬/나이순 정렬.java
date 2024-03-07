import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	int age;
	String name;
	public Main(int age, String name) {
		this.age=age;
		this.name=name;
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Main list[] = new Main[N];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			list[i]=new Main(Integer.parseInt(st.nextToken()),st.nextToken());
		}
		
		Arrays.sort(list,new Comparator<Main>() {

			@Override
			public int compare(Main o1, Main o2) {
				return o1.age-o2.age;
			}
			
		});
		
		for(int i=0; i<N; i++) 
			System.out.println(list[i].age+" "+list[i].name);
		
		br.close();		
    }
    
}