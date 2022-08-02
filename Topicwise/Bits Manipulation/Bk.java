public class Bk {
    public static void main(String[] args) {
        int num=10;
        int countSetBit=0;
        while(num>0){
            num=(num&(num-1));
           
                countSetBit++;  
        }
        System.out.println(countSetBit);
    }
    //using brain karyngoms algo O(1)
}
