import java.util.Scanner;

public class findXORwithoutOper {
    static int XOR(int x, int y)
{
    return (x | y) &
           (~x | ~y);
}
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first no");
        int x=scan.nextInt();
        System.out.println("Enter the Second no");
        int y=scan.nextInt();
   
   System.out.println("Xor Operations without Xor operator   "+XOR(x, y));
   scan.close();
    }
}


// 1) Find bitwise OR of x and y (Result has set bits where either x has set or y has set bit). OR of x = 3 (011) and y = 5 (101) is 7 (111)
// 2) To remove extra set bits find places where both x and y have set bits. The value of the expression “~x | ~y” has 0 bits wherever x and y both have set bits.
// 3) bitwise AND of “(x | y)” and “~x | ~y” produces the required result.