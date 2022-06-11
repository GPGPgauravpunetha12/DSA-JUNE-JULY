public class WaterTrapping {
    public static void main(String[] args) {
        int bars[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int leftBarsMax[] = new int[bars.length]; // PrefixMax
        int rightBarsMax[] = new int[bars.length]; // SuffixMax
        leftBarsMax[0] = bars[0]; // Set the first element in PrefixMax
        for (int i = 1; i < bars.length; i++) {
            leftBarsMax[i] = Math.max(leftBarsMax[i - 1], bars[i]);
        }
        System.out.println("Prefix Max");
        for (int element : leftBarsMax) {
            System.out.print(element + " ");
        }
        System.out.println();
        rightBarsMax[rightBarsMax.length - 1] = bars[bars.length - 1]; // Set the Last Element in the Suffix Max
        for (int i = rightBarsMax.length - 2; i >= 0; i--) {
            rightBarsMax[i] = Math.max(rightBarsMax[i + 1], bars[i]);
        }
        System.out.println("Suffix Max");
        for (int element : rightBarsMax) {
            System.out.print(element + " ");
        }
        System.out.println();
        int amountOfWater = 0;
        for (int i = 0; i < bars.length; i++) {
            int currentPillar = bars[i];
            int barMinHeight = Math.min(leftBarsMax[i], rightBarsMax[i]);
            if (barMinHeight > currentPillar) {
                amountOfWater += barMinHeight - currentPillar;
            }
        }
        System.out.println("Amount of Water " + amountOfWater);

    }
}
