import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {

      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

      StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
      int treeCounts = Integer.parseInt(stringTokenizer.nextToken());
      int treeLengthInNeed = Integer.parseInt(stringTokenizer.nextToken());

      stringTokenizer = new StringTokenizer(bufferedReader.readLine());

      int[] trees = new int[treeCounts];
      while(treeCounts-->0){
         trees[treeCounts] = Integer.parseInt(stringTokenizer.nextToken());
      }

      int l = 0;
      int r = 1000000000;
      int answer = -1;

      while (l <= r) {
         int x = (l + r) / 2;
         if (isPossible(trees, x, treeLengthInNeed)) {
            answer = x;
            l = x + 1;
         } else {
            r = x - 1;
         }
      }
      System.out.println(answer);

   }

   public static boolean isPossible(int[] trees, int cutHeight, int thresholdHeight) {
      long sum = 0;
      for (int tree : trees) {
         if (tree > cutHeight) {
            sum += tree - cutHeight;
         }
      }
      return sum >= thresholdHeight;
   }

}