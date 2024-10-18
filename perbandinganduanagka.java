import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class perbandinganduanagka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        String answer = sc.next();
        if (a > b) {
            System.out.print("Angka pertama lebih besar.");
        }
        if (a < b) {
            System.out.print("Angka pertama lebih kecil.");
        }
        if (a == b) {
            System.out.println("Angka pertama sama dengan angka kedua.");
            if (a % 2 == 0 && b % 2 == 0) {
                if (answer.equals("genap")) {
                    System.out.print("Yeay, Anda benar, " + a + " adalah genap.");
                }
                else{
                    System.out.println("Yah, jawaban Anda salah, " + a + " adalah genap.");
                }
            }
            if (a % 2 == 1 && b % 2 == 1) {
                if (answer.equals("ganjil")) {
                    System.out.print("Yeay, Anda benar, " + a + " adalah ganjil.");
                }
                else{
                    System.out.println("Yah, jawaban Anda salah, " + a + " adalah ganjil.");
            } 
        }
        // answer = answer.equals("ganjil")? "Yeay, Anda benar, " + a + " adalah genap." : "yauda";
        }
    }
}