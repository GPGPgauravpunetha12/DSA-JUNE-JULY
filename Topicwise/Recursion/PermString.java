import java.util.ArrayList;

    public class PermString {
    
        static ArrayList<String> perm(String str) {
            // Termination case
            if (str.length() == 0) {
                ArrayList<String> list = new ArrayList<>();
                list.add("");
                return list;
            }
            // Get a Single Char (Stack fall)
            char singleChar = str.charAt(0);
            // Make String small (Small Problem)
            String subString = str.substring(1);
            ArrayList<String> result = perm(subString);
            ArrayList<String> finalResult = new ArrayList<>();
            // We Create Permutation
            for (String s : result) {
                for (int i = 0; i <= s.length(); i++) {
                    StringBuffer sb = new StringBuffer(s);
                    sb.insert(i, singleChar);
                    finalResult.add(sb.toString());
    
                }
            }
            return finalResult;
    
        }
    
        public static void main(String[] args) {
            System.out.println(perm("abc"));
        }
    }
    