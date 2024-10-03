import java.util.*;
public class segitigamiring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int a, b;
        for (a = 0; a < n; a++) {
            for (b = 2 * (n - a); b > 0; b--) {
                System.out.print(" ");
            }
            for (b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}