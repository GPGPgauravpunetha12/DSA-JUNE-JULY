public class KMP {

    static int generateLPS(String str, int stringLen) {
        // Suffix value get
        for (int len = stringLen - 1; len > 0; len--) {
            // Prefix Value Get
            boolean isMatch = true;
            for (int i = 0; i < len; i++) {
                System.out.println("I Prefix " + i + " Prefix Char " + str.charAt(i) + " Suffix "
                        + (stringLen - len + i) + " Suffix Char  " + str.charAt(stringLen - len + i));
                if (str.charAt(i) != str.charAt(stringLen - len + i)) {
                    isMatch =false;
                }
            }
            if (isMatch) {
                return len;
            }
        }
        // No Char Match return 0 length
        return 0; // return length of Common Char Prefix , Suffix
    }

    public static void main(String[] args) {
        String str = "ababc";
        int lps[] = new int[str.length()];
        for (int i = 0; i < lps.length; i++) {
            lps[i] = generateLPS(str, i + 1);
        }
        for (int e : lps) {
            System.out.print(e + " ");
        }
        System.out.println();

    }}