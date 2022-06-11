import java.util.HashMap;

public class RunLength {
    
    public static void main(String[] args) {
        char[]chara={'a','b','c','d','a'};
        HashMap <Character, Integer> map = new HashMap<>();
        int count=0;
        for(char singlechr:chara){
        if(map.get(singlechr)==null){
         map.put(singlechr, 1);
        }
        else{
            count=map.get(singlechr);
            count++;
            map.put(singlechr, count);
        }}
        System.out.println(map);
    }
}
