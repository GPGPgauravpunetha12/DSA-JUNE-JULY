import java.util.ArrayList;

public class Runlengthencoding {
    public static void main(String[] args) {
        String str="aabbcc";
        ArrayList<String> subSeqList = new ArrayList<>();
        int len = str.length();
        int count=0;
        int j=0;
        String temp ;
        for (int i = 0; i < len; i++) {
            char firstChar = str.charAt(i);
           
            if (subSeqList.size() == 0) {
              //  subSeqList.add(""); // Not Include it     [, a, b, ab, c, ac, bc, abc, d, ad, bd, abd, cd, acd, bcd, abcd]
                
              subSeqList.add("" + firstChar);// Include it
                
            }
         
       
            if(str.charAt(i)==str.charAt(j)){ 
                
                count++;
            if(count!=0)
              {
                  i++;
                  j++;
              }}

            String s=String.valueOf(count);
          //  int subLen = subSeqList.size();
    
            for ( j = 0; j <s.length(); j++) {
            
            temp = firstChar+s;
            subSeqList.add(temp); 
            }
          
 }
    System.out.print(subSeqList);
    }
}
