import java.util.Scanner;

public class No_Of_Digit {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check digit count");
        int a = sc.nextInt();
        int c = 0;
        while (a != 0) {
            c++;
            a = a / 10;
        }
        System.out.println(c);

        System.out.println(Approach2(a));

    }

    static int Approach2(int n) {
        int c = (int) (Math.log10(n) + 1);
        return c;
    }
}
