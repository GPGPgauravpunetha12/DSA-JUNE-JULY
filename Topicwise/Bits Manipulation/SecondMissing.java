public class SecondMissing {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,7};
        int xor=arr.length+2;
        for (int i = 0; i < xor; i++) { 
        xor ^= i ^ arr[i];
        for(int j=xor+1;j < arr.length+2; j++){
            xor ^= j ^ arr[j];
        }
                    }
System.out.println("Second missing: " +(xor));
    }
}
