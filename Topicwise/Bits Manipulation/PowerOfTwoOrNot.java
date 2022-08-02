public class PowerOfTwoOrNot {
    public static void main(String[] args) {
    
        System.out.println("Power of two  "+powerOfTwoOr(32));
    }

    private static boolean powerOfTwoOr(int x) {
    
        return x!=0 && ((x&(x-1)) == 0);
    }
}
