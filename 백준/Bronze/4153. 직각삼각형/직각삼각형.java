import java.util.*;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

		while (true) {
			int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			Arrays.sort(arr);

			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
				break;
			}

			if (Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
        sc.close();
    }    
}