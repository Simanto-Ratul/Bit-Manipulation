import java.util.Scanner;

public class clearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();

        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println("Result : " + newNumber);
    }
}
