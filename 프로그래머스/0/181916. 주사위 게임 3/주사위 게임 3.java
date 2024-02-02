import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int num = 1;
        
        int[] arr = new int[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        Arrays.sort(arr);
        
        int[] dice = new int[6];
        for(int i = 0; i < 4; i++){
            dice[arr[i]-1]++;
        }
        
        for(int i = 0; i < 6; i++){
            if(dice[i] == 4){
                answer = 1111*(i+1);
                break;
            }
            else if(dice[i] == 3){
                for(int j = 0; j < 6; j++){
                    if(dice[j] == 1){
                        answer=(10*(i+1)+(j+1))*(10*(i+1)+(j+1));
                        break;
                    }
                }
            }
            else if(dice[i] == 2){
               for(int j = 0; j < 6; j++){
                    if(dice[j] == 2){
                        if(i == j){
                            continue;
                        }
                        else{
                            answer=(i+1+j+1)*((i+1)-(j+1));
                            break;
                        }
                        
                    }
                   else if(dice[j] == 1){
                        num = num*(j+1);
                   }
                }
                if(num != 1){
                    answer = num;
                }
            }
            if(arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[3]){
                answer = arr[0];
            }
                
        }
        
        return answer;
    }
}