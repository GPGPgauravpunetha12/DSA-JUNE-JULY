import java.util.ArrayList;

public class MazePathProblem {

    static ArrayList<String> getMazePaths(int currentRow, int currentCol, int endRow, int endCol) {
        // Termination Case
        if (currentCol == endCol && currentRow == endRow) {
            ArrayList<String> list = new ArrayList<>();
            list.add(" ");
            return list;
        }
        // Edge Case
        if (currentCol > endCol || currentRow > endRow) {
            ArrayList<String> list = new ArrayList<>();

            return list;
        }
        // Final Result
        ArrayList<String> finalResult = new ArrayList<>();
        // Small Problem
        // Horizonotal Increment
        ArrayList<String> hResult = getMazePaths(currentRow, currentCol + 1, endRow, endCol);
        for (String r : hResult) {
            finalResult.add("H" + r);
        }
        // Vertical Increment
        ArrayList<String> vResult = getMazePaths(currentRow + 1, currentCol, endRow, endCol);
        for (String r : vResult) {
            finalResult.add("V" + r);
        }
        return finalResult;
    }

    public static void main(String[] args) {

        System.out.println(getMazePaths(0, 0, 2, 2));
    }
}
