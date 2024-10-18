import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class validasitasangka {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        // double angka = a.nextDouble();
        if (a.hasNextInt()) {
            int angka = a.nextInt();
            if (angka >= 1 && angka <= 10) {
                System.out.println("Angka " + angka + " adalah valid");
            } else{
                System.out.println("Angka "+ angka+ " tidaklah valid");
            }
        } else if (a.hasNextDouble()) {
            double angka = a.nextDouble();
            if (angka >= 1 && angka <= 10) {
                System.out.println("Angka " + angka + " adalah valid");
            } else{
                System.out.println("Angka "+ angka+ " tidaklah valid");
            }
        }
    }
}