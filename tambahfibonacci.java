import java.io.*;
import java.util.*;

public class tambahfibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int b = 0;
        int a = 1;
        int total = 1;

        for(int i = 1; i <= input; i++){
            // if (total > input) {
                // System.out.println(total);
                // break;
        // }
            total = a + b;
            b = a;
            a = total;
            System.out.println("Fibonacci ke-"+i+"Bernilai"+total);
        }
    }
}