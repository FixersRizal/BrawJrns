import java.util.*;
public class segitigamiring {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Masukan harus positif.");
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}