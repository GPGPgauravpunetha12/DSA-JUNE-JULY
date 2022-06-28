class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int opening = 0;
        int closing = 0;
        generateParenthesisLogic(n, opening, closing, result, "");
        return result;

    }

    void generateParenthesisLogic(int n, int opening, int closing, List<String> result, String brackets) {
        // Termination Case
        if (brackets.length() == n * 2) {
            result.add(brackets);
            return;
        }
        if (opening < n) {
            generateParenthesisLogic(n, opening + 1, closing, result, brackets + "("); // Small Problem
        }
        if (closing < opening) {
            generateParenthesisLogic(n, opening, closing + 1, result, brackets + ")"); // Small Problem
        }
    }
}