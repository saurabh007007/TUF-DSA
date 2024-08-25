import java.util.*;

public class Pront_All_Divisor {
    public static void main(String[] args) {
        int n = 10;
        int[] size = new int[1];
        int[] divisor = PrintDivisor(n, size);
        System.out.println(divisor);
    }

    public static int[] PrintDivisor(int n, int[] size) {
        int[] divisor = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisor[count++] = i;

            }

        }
        size[0] = count;
        return divisor;

    }

}