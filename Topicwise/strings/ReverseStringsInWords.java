public class ReverseStringsInWords {
    public static void main(String[] args) {
        String str="I love my  India";
        String words[]=str.split("\\s+"); //+ will see for more space more than one space// for regular exp of space we can break space 
        StringBuilder sb=new StringBuilder(); 
        for (int i = words.length - 1; i >= 0; i--) {
         sb.append(words[i]).append(" ");
        }
         System.out.println(sb.toString().trim()); 
    }}
    // SIMPLE code  
    
    // class Solution {
    //     public String reverseWords(String s) {
    //   //  String words[]=str.split("\\s+"); //+ will see for more space more than one space// for regular exp of space //we can //break space 
    // s=s.trim();
    // String[] f=s.split("\s+");
    // String an="";
    
    // for(int i=f.length-1;i>=0;i--)
    // {
    
    //         an+=f[i];
    //         if(i!=0) {
    //             an += " ";
    //         }
            
    
    // }
    // return an;
    
    //     }
    // }