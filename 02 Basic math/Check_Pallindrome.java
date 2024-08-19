import java.util.*;;

public class Check_Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check pallindroe");
        int n = sc.nextInt();
        if (Pallindrome((n))) {
            System.out.println("Pallindeome hai bhai");
        } else {
            System.out.println("Pallindrome nhi hai bhai");
        }
    }

    public static boolean Pallindrome(int n) {
        int a = 0;
        int b = n;
        while (n != 0) {
            a = a * 10 + n % 10;
            n = n / 10;
        }
        return a == b;
    }
}
