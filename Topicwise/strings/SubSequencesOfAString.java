import java.util.ArrayList;

public class SubSequencesOfAString {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> subSeqList = new ArrayList<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char firstChar = str.charAt(i);
            if (subSeqList.size() == 0) {
                subSeqList.add(""); // Not Include it     [, a, b, ab, c, ac, bc, abc, d, ad, bd, abd, cd, acd, bcd, abcd]
                subSeqList.add("" + firstChar);// Include it
                continue;
            }
            int subLen = subSeqList.size();
            for (int j = 0; j < subLen; j++) {
                String temp = subSeqList.get(j) + firstChar;
                subSeqList.add(temp);
            }

        }
        System.out.println("SubSequences are " + subSeqList);

    }
}
