public class RBpatternMatching {
   public static void main(String[] args) {
//     String str = "ABCDABCWABCE" ;
//     String pat = "ABCD" ;
//     int d=2;//diferent hash
//     int q=13 //large  prime no to make a positive value of it for large hash
//     int n=str.length();
// int p=pat.length();
// int StringHash=0;
// int patternHash=0;
// for (int i=0; i<=n; i++){ //prortise it (n-p)

// patternHash=(patternHash*d+ (pat.charAt(i)))%q;
// StringHash=(patternHash*d+ (str.charAt(i)))%q;
// }}

// for (int i=0; i<n-p; )
// if(patternHash==StringHash){
//     for (j=0; j<p; j++){
//         if(pat.charAt(j)!=str.charAt(i+j)){
//             // System.out.println("pattern dosent exist found");
//            // works only for distincr=t character
//             break;
//         } }
//           // j loop end 
//           if(j==p){
//             System.out.println("patern found"+i);
//         }
//         if(i<i+p){

//         }
// }
// }
String str = "ABCDABCWABCE";
        String pattern = "ABCD";
        int n = str.length();
        int p = pattern.length();
        int d = pattern.length();
        int q = 13; // Prime No / Large Prime No (If Hash is coming Negative)
        int stringHash = 0;
        int patternHash = 0;
        // Compute the Pattern Hash First
        for (int i = 0; i < p; i++) {
            patternHash = (patternHash * d + (pattern.charAt(i))) % q;
            stringHash = (stringHash * d + (str.charAt(i))) % q;
        }
        for (int i = 0; i <= n - p; i++) {
            if (patternHash == stringHash) {
                // compare the pattern with string values one by one
                int j;
                for (j = 0; j < p; j++) {
                    if (pattern.charAt(j) != str.charAt(i + j)) {
                        break;
                    }
                } // j loop ends (Pattern loop ends)
                if (j == p) {
                    System.out.println("Pattern Match " + i);
                }
                // recompute str Hash only
                if (i < n - p) {
                    stringHash = ((stringHash * d + str.charAt(i + p)) - str.charAt(i)) % q;
                    if (stringHash < 0) {
                        stringHash = stringHash + q;
                    }
                }

            }
        }

    }

}