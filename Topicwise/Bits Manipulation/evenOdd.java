import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        if((num & 1) ==0){
            System.out.println("Even No "+num);
        }
        else{
            System.out.println("Odd No "+num);
        }
        scanner.close();
    }
}