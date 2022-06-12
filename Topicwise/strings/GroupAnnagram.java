import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnnagram {
    
    
        public static List<List<String>> groupAnagrams(String[] strs) {
          
         HashMap<HashMap<Character,Integer>,List<String>> bmap=new HashMap<>();
            for(String str:strs)
            {
                HashMap<Character,Integer> fmap= new HashMap<>();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
            fmap.put(ch,fmap.getOrDefault(ch,0)+1);
                }
            //dosenot contain in map then 
            if(bmap.containsKey(fmap)==false){
                List<String> List=new ArrayList<>();
                List.add(str);
                bmap.put(fmap,List);
            }
            else{//iff alerady there in map
              List<String> List=bmap.get(fmap)  ;
                List.add(str);
            }
    }
        // wiil giv all the arraylis t do that we can give o/p in arraylist of list
        List<List<String>> res= new ArrayList<>();
        for(List<String>val:bmap.values()){
            res.add(val);}
         
    return res;
    }
public static void main(String[] args) {
    String[] str1={"eat","tea","tan","ate","nat","bat"};
    groupAnagrams(str1);
}}