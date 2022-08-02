public class EditDistance {


    static int editDistanceOperationCount(String first, String second, int m, int n) {

        // Termination Case
        // if first string is exhaust
        if (m == 0) {
            return n; // return length of second string and it become number of operation left
        }
        if (n == 0) {
            return m; // return length of first string and it become number of operations left
        }

        // Current Character Match
        if (first.charAt(m - 1) == second.charAt(n - 1)) {
            // Move to the Next Character
            return editDistanceOperationCount(first, second, m - 1, n - 1);
        }
        // If character not match so we have 3 choices
        // 1 Choice Insert 2. Choice Delete 3. Choice Replace
        int insert = editDistanceOperationCount(first, second, m, n - 1);
        int delete = editDistanceOperationCount(first, second, m - 1, n);
        int replace = editDistanceOperationCount(first, second, m - 1, n - 1);
        int min = Math.min(Math.min(insert, delete), replace); // Get Min of All Choices
        return 1 + min;
    }

    public static void main(String[] args) {
        String first = "sunday";
        String second = "saturday";
        int count = editDistanceOperationCount(first, second,
                first.length(), second.length());
        System.out.println(count);

    }
}
