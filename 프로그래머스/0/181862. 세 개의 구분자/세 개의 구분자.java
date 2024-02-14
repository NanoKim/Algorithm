import java.util.*;
class Solution {
    public List solution(String myStr) {
        List<String> list = new ArrayList<String>();
        String str = "";
        
        for(int i = 0 ; i < myStr.length(); i++){
            char ch = myStr.charAt(i);
            if(ch == 'a' || ch == 'b' || ch == 'c'){
                if(str != ""){
                    list.add(str);
                    str = "";
                }
            }else {
                str += ch;
            }
        }
        if(str != ""){
            list.add(str);
            str = "";
        }
        
        if(list.size() == 0) list.add("EMPTY");
        return list;
    }
}