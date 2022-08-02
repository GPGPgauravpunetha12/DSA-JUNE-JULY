public class CountSetBit {
    public static void main(String[] args) {
        int num=10;
        int countSetBit=0;
        while(num>0){
            if((num&1)!=0){
                countSetBit++;  
            }
            num=num>>1;//divide by 2^0
        }
        System.out.println(countSetBit);
    }
}
