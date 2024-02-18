import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		String arr[] = {};
		List<String> list = new ArrayList<>(Arrays.asList(arr));

		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				list.add(Integer.toString(i));
			}
		}

		arr = list.toArray(arr);

		if(arr.length<k) {
			System.out.println(0);
		}else {
			System.out.println(arr[k-1]);
		}
    }
}