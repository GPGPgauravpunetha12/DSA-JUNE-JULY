import java.util.Arrays;

public class ValidAnnagram {
    public static boolean isAnagram(String s, String t) {
       //enhancement
//         int [] char_count = new int[26];
// if(s.length() != t.length())
// return false;
// for(int i=0;i<s.length();i++){
// char_count[s.charAt(i) -'a']++;
// char_count[t.charAt(i) - 'a']--;
// }
// for(int count : char_count){
// if(count !=0)
// return false;
// }
// return true;
// }
// }


        // int n,p;
        // int i=0;
        // int count=0;
//       if(s.length()!=t.length())return false;
//         int[] count =new int[256];
//         for(int i=0;i<s.length();i++){
//             count[s.charAt(i)]--;
//             count[t.charAt(i)]++;
//         }
//         for(int i: count)if(i!=0)return false;
//         return true;
//     }
// }
        
    //  Approch-2  hashmap
//         n=s.length();
//             p=t.length();
        
//         HashMap <Character,Character> map=new HashMap<>();
//         while(i!=n||i!=p){ 
//             map.put(s.charAt(i),t.charAt(i));
//         i++;
//             if(map.conatainKey(s.charAt(i))
        // }
        
        
        //mmmmyyyyyyyyy wwwayyyy
//        if(n!=p)
//            return false;
        
//         while(n!=i||p!=i){
//             if(s.charAt(i)==t.charAt(i)&&n==p)
//           {  i++;
//             count++;
//            return true;
//           }
//          }
//         if(count==n+p){
//             return true;
//         }
//         return false;
//     }}
        
       // esy approch
        // char s1[]= s.toCharArray();
        // char t1[]= t.toCharArray();
        
        // Arrays.sort(s1);
        // Arrays.sort(t1);
        
        //     return (String.valueOf(s1).equals(String.valueOf(t1)));
    
}
public static void main(String[] args) {
    String s="hello";
    String t="ohell";
    isAnagram(s,t);
    System.out.println(isAnagram(s,t));
}}