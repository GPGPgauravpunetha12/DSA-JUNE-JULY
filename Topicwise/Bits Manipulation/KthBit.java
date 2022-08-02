import java.util.Scanner;
public class KthBit {
    
 public static void main(String[] args) {
      Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        System.out.println("Enter the Kth");
        int kth = scanner.nextInt();
        if(((num>>(kth-1)) & 1) == 1){
            System.out.println("Yes BIt Set");
        }
        else{
            System.out.println("No Bit Set");
        }
        scanner.close();
    }
}
