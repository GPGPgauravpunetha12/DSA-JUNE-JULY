public class ReverseString{
    public static String reverse(String str) {
       
       char c=str.charAt(0);//t
    //  reverse(str.substring(1));//small string oy
      if(str.length()==1){
            return String.valueOf(str.charAt(0));// will return last character if length of string is 1

        }
      

    return  reverse(str.substring(1))+ c;
    }
    public static void main(String[] args) {
        String str="Toy";
        
    System.out.println( reverse(str));   }
}