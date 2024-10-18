import java.util.*;
public class urutangka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int pertama = 0, kedua = 0, ketiga = 0;
        //pertama
        if (a < b && a < c) {
        pertama = a;
        }
        else if (c < a && c < b) {
        pertama = c;
        }
        else if (b < a && b < c) {
        pertama = b;
        }
        else if (a == b && a == c) {
            pertama = a;
        }
        //kedua
        if (a > pertama) {
            kedua = a;
        }
        else if (b > pertama) {
            kedua = b;
        }
        else if (c > pertama) {
            kedua = c;
        }
        else if (a == pertama || b == pertama || c == pertama) {
            kedua = pertama;
        }
        //ketiga
        if (a > kedua && a > pertama) {
            ketiga = a;
        }
        else if (b > kedua && b > pertama) {
            ketiga = b;
        }
        else if (c > kedua && c > pertama) {
            ketiga = c;
        }
        else if ((a == pertama && a == kedua) || (b == pertama && b == kedua) || (c == pertama && c == kedua)) {
            ketiga = kedua;
        }
        System.out.println(pertama);
        System.out.println(kedua);
        System.out.println(ketiga);
    }
}
