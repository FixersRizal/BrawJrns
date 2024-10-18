import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kuadratangka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0) {
            System.out.print("Tidak ada kuadrat yang dicetak.");
        }
        for(int a = 0, s = 1; a <= i && s <= i; a++,s++){
            int total = s * s;
            System.out.print(s + " ^ " + "2 " + "= " + total);
            System.out.println();
        }
    }
}