import java.io.*;
import java.util.*;

public class penjumlahangenap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hasil = 0;
        for (int i = 0; i <= a; i++){
            if (i % 2 != 0) {
                continue;
            }
            hasil += i;
        }
        System.out.println(hasil);
    }
}