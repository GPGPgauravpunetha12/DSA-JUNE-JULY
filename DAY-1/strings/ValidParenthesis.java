import java.util.HashMap;
import java.util.Stack;

// class Solution {
//     public boolean isValid(String s) {
// //  Stack<Character> st = new Stack<>();
    
// //     for(int i = 0; i<s.length(); i++){          // iterate entire String.
// //         char c = s.charAt(i);
        
// //         if(c == '(' || c == '[' || c == '{'){   // check if char at i is an opening bracket, if yes, push it in the stack.
// //             st.push(c);
// //         }
// //         else if ( c == ')' || c == ']' || c == '}'){ // if it's a closing bracket, compare it with top element in the stack.
// //             if(st.isEmpty()) {  // if stack is empty that means no open bracket to match the closing one.
// //                 return false;
// //             }
            
// //             char c2 = st.pop();
// //             if((c2 == '(' && c == ')') || (c2 == '[' && c == ']') || (c2 == '{' && c == '}')){
// //                 continue;
// //             }
// //             else{
// //               return false;  
// //             } 
// //         }
// //     }
// //     if(st.isEmpty())  // at the end if stack is not empty that means it has some opening bracket that does not have any matching closing bracket hence return false.
// //         return true;
// //     return false;
// // }}


         ///APPPPROCHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH-2 using stack and hashmap O(1)                 
public class ValidParenthesis{
public static  boolean vdParen(String s){
        int n=s.length();
        
          char singlechar;
  
        HashMap <Character,Character> map =new HashMap<>();
      map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        int topvalue;
        Stack <Character> st=new Stack<> ();
        for(int i=0;i<n;i++){
            
            singlechar=s.charAt(i);
            //closing
            if(map.containsKey(singlechar)){
                  if(st.empty()){
                      return false;
                     }
                   else{
                     topvalue=st.pop();
                       if(topvalue!=map.get(singlechar))
                           return false;
                       }
            }
            else {//opening
                st.push(singlechar);
            }
            
        }
     
        return  st.isEmpty();
    }
public static void main(String[] args) {
    String str = "{}()[]";
    vdParen(str);
    System.out.println( vdParen(str));
}}