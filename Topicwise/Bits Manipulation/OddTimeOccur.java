public class OddTimeOccur {
    public static void main(String[] args) {
        int ar[]={10,23,34,10,9,10,23,34,9,23,10};
    int odd=0;
    for(int ele:ar){
        odd=odd^ele;
    }
    System.out.println(odd);
    }
}
