import java.util.*;

public class Check_HCF {
    public static void main(String[] args) {

        System.out.println(Hcf_Chcek(10, 20));
    }

    public static int Hcf_Chcek(int n1, int n2) {

        for (int i = Math.min(n1, n2); i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

}
