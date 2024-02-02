import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list= new ArrayList();
        
        int i=0;
        while(i<arr.length){
            if(list.size()==0){
                list.add(arr[i]);
                i+=1;
            }else{
                int last=list.get(list.size()-1);
                
                if(list.size()!=0 && last<arr[i]){
                    list.add(arr[i]);
                    i+=1;
                }else if(list.size()!=0 && last>=arr[i]){
                    list.remove(list.size()-1);
                }
            } 
        }
        
        int arr2[]=new int[list.size()];
        
        for(int k=0;k<list.size();k++){
            arr2[k]=list.get(k).intValue();
        }
        return arr2;
    }
}