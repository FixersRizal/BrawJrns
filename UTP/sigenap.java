import java.util.*;
public class sigenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hasil = 0;
        for(int gen = a; gen <= b; gen++){
            if (gen % 2 != 0) {
                continue;
            }
            hasil += gen;
        }
        System.out.println(hasil);
    }
}
