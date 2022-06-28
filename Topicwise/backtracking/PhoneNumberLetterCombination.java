import java.util.ArrayList;
import java.util.List;

public class PhoneNumberLetterCombination {
    String keys[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            List<String> r = new ArrayList<>();
            return r;
        }
        return letterCombinations2(digits);
    }

    private List<String> letterCombinations2(String digits) {
        // Termination Case
        if (digits.length() == 0) {
            List<String> r = new ArrayList<>();
            r.add("");
            return r;
        }
        // Small Problem
        // 1. Get a Single Digit/ Character
        char singleChar = digits.charAt(0);
        int digit = singleChar - '0';
        String strKeys = keys[digit];
        String remString = digits.substring(1); // Small Problem
        List<String> finalResult = new ArrayList<>();
        // Traverse a String e.g 2 - abc (abc traverse char by char)

        for (int i = 0; i < strKeys.length(); i++) {
            List<String> result = letterCombinations2(remString);
            for (String s : result) {
                finalResult.add(strKeys.charAt(i) + s); // d+""
            }
        }
        return finalResult;

    }
}
