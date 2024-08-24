import java.util.Scanner;

public class Armstrong_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check armstrong no");
        int a = sc.nextInt();
        if (Armstrong(a)) {
            System.out.println("Armstrong hai bhai ");
        } else {
            System.out.println("Armstrong nhi hai bhai");
        }
    }

    public static boolean Armstrong(int n) {
        int c = 0;
        int b = n;
        int a = n;
        int sum = 0;
        while (n != 0) {
            c++;
            n = n / 10;

        }
        while (b != 0) {
            sum = sum + (int) Math.pow(b % 10, c);
            b = b / 10;
        }

        return a == sum;
    }
}