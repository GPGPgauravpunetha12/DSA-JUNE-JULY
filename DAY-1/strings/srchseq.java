
public class srchseq {
    public static void main(String[] args) {
        String str="hello";
        String srch="ho";
        int j=0;
        for (int i = 0; i < str.length(); i++) {
          if(str.charAt(i) == srch.charAt(j)){
              j++;
          }
         
        }
        if(j==srch.length()) {
            System.out.println("patern found"+j);
        }
        else {
          System.out.println("patern  not found");
        }
    }
}
// String str = "abcd";
// String search = "bd";
// int len = str.length();
// int j = 0;
// for (int i = 0; i < len; i++) {
//     if (str.charAt(i) == search.charAt(j)) {
//         j++;
//     }
// }
// System.out.println(j == search.length() ? "Pattern Found..." : "Not Found...");