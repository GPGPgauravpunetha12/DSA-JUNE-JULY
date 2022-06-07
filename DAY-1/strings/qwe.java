
public class qwe {
    public static void main(String[] args) {
        String str="hello";
        String srch="ho";
        int j=0;
        for (int i = 0; i < str.length(); i++) {
          if(str.charAt(i) == str.charAt(j)){
              j++;
          }
         
        }
        if(j==srch.length()) {
            System.out.println("patern found");
        }
        else {
          System.out.println("patern  not found");
        }
    }
}
