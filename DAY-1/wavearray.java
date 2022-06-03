public class wavearray {
    public static void main(String[] args) {
        int temp=0;
        int[]a={8,9,8,6,7,0};
        int n=6;
        for(int i=0;i<n-1;i=i+2)
        {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        } 
    }
}
