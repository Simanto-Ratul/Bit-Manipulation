import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        if ((bitMask & n) == 0) {
            System.out.println("Bit was Zero.");
        } else {
            System.out.println("Bit was One.");
        }
    }
}