public class AlphabetsPatterns {
    // Pattern-1        
    // A
    // BB 
    // CCC 
    // DDDD  
public static void main(String[] args) {
    int n=5;
    int value=65;
    alpha(value,n);
 System.out.println();//new line
}

public static void alpha(int value,int n) {
    if(value<=70||n==0)
    return;
    System.out.print((char)value);
    alpha(value+1,n-1);
}
}
