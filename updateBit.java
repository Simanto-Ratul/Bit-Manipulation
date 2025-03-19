import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your operation : ");
        int oper = sc.nextInt();
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();

        int bitMask = 1 << pos;
        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println("Result : " + newNumber);
        } else {
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println("Result : " + newNumber);
        }
    }
}
