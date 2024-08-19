import java.util.*;

public class Reverse_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter digit to reverse:");
        int n = sc.nextInt();
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(r);
    }
}
