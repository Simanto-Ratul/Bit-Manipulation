import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        System.out.print("Enter the position : ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.print("Result : " + newNumber);
    }
}
