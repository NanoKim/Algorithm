import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	static LinkedList<int[]> sarr;
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while(T --> 0){
        	sarr = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for(int i = 0; i < N; i++){ 
            	sarr.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            sb.append(solution(M)).append("\n");
        }
        br.close();
        
        System.out.println(sb);
    }
    
    static int solution(int M){
        int findIt = 0;

        while(!sarr.isEmpty()){

            int[] first = sarr.poll();
            boolean isMax = true;

            for(int i = 0; i < sarr.size(); i++){

                if(first[1] < sarr.get(i)[1]){

                	sarr.offer(first);

                    for(int j = 0; j < i; j++){
                    	sarr.offer(sarr.poll());
                    }

                    isMax = false;
                    break;
                }
            }

            if(isMax == false){
                continue;
            }

            findIt++;

            if(first[0] == M){
                break;
            }
        }

        return findIt;
    }
    
}