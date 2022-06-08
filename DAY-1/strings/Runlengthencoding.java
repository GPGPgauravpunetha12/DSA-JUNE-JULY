// import java.util.ArrayList;

public class Runlengthencoding {
    public static void main(String[] args) {
       
//         ArrayList<String> subSeqList = new ArrayList<>();
//         int len = str.length();
//         int count=0;
//         int j=0;
//         String temp ;
//         for (int i = 0; i < len; i++) {
//             char firstChar = str.charAt(i);
           
//             if (subSeqList.size() == 0) {
//               //  subSeqList.add(""); // Not Include it     [, a, b, ab, c, ac, bc, abc, d, ad, bd, abd, cd, acd, bcd, abcd]
                
//               subSeqList.add("" + firstChar);// Include it
                
//             }
         
       
//             if(str.charAt(i)==str.charAt(j)&&i<len)
//               count++;
       

//             String s=String.valueOf(count);
//           //  int subLen = subSeqList.size();
    
//             for ( j = 0; j <s.length(); j++) {
            
//             temp = firstChar+s;
//             subSeqList.add(temp); 
//             }
          
//  }
//     System.out.print(subSeqList);
String str="aabbcc";
int n = str.length();
for (int i = 0; i < n; i++) {

    // Count occurrences of current character
    int count = 1;
    while (i < n - 1
           && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
    }

    // Print character and its count
    System.out.print(str.charAt(i) + "" + count);
}
}
}
