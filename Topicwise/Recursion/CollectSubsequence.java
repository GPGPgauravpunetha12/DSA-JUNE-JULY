import java.util.ArrayList;

public class CollectSubsequence {
    static ArrayList<String> getSubSequence(String name) {
        // Termination case
        if (name.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(" "); // return a arraylist with blank value
            return list;
        }
        // get the single character which is used to join in arraylist when stack fall
        char singleChar = name.charAt(0);
        // make the string small till we reach to empty string
        // to make it small we do substring
        String subString = name.substring(1); // pick string from 1st index till end
        ArrayList<String> result = getSubSequence(subString);
        ArrayList<String> finalResult = new ArrayList<>();
        for (String s : result) {
            finalResult.add(s); // Not Include the First char
            finalResult.add(singleChar + s); // Include the first char
        }
        return finalResult;

    }

    public static void main(String[] args) {
        ArrayList<String> results = getSubSequence("amit");
        System.out.println(results);
    }
}
