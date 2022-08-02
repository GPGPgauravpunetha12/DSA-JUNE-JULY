public class whetherNumberAreEqual {
    public static void main(String[] args) {
       
        System.out.println( EqualorNot(3,2));
    }

    private static boolean EqualorNot(int x, int y) {
        return x!=0 && ((x&(y-1)) == 0)&&y!=0 ;
    }
}
