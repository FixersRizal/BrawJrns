import java.util.Scanner;
public class goldarah {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    String inputdarah = a.next();
    if (inputdarah.equals("A+")) {
        System.out.print("Bisa mendonorkan darah ke golongan darah A+ dan AB+");
    }
    else if (inputdarah.equals("A-")) {
        System.out.print("Bisa mendonorkan darah ke golongan darah A+, A-, AB+, dan AB-");
    }
    else if (inputdarah.equals("B+")) {
        System.out.print("Bisa mendonorkan darah ke golongan darah B+ dan AB+");
    }
    else if (inputdarah.equals("B-")) {
        System.out.print("Bisa mendonorkan darah ke golongan darah B+, B-, AB+, dan AB-");
    }
    else if (inputdarah.equals("AB+")) {
        System.out.print("Bisa mendonorkan darah untuk golongan darah AB+");
    }
    else if (inputdarah.equals("AB-")) {
        System.out.print("Bisa mendonorkan darah untuk golongan darah AB+ dan AB-");
    }
    else if (inputdarah.equals("O+")) {
        System.out.print("Bisa mendonorkan darah ke golongan darah O+, A+, B+, dan AB+");
    }
    else if (inputdarah.equals("O-")) {
        System.out.print("Bisa mendonorkan darah ke delapan golongan darah");
    } else {System.out.print("inputan salah");}
    }
}
// Golongan Darah A+ : Bisa mendonorkan darah ke golongan darah A+ dan AB+
// Golongan Darah A- : Bisa mendonorkan darah ke golongan darah A+, A-, AB+, dan AB-
// Golongan Darah B+ : Bisa mendonorkan darah ke golongan darah B+ dan AB+
// Golongan Darah B- : Bisa mendonorkan darah ke golongan darah B+, B-, AB+, dan AB-
// Golongan Darah AB+ : Bisa mendonorkan darah untuk golongan darah AB+
// Golongan Darah AB- : Bisa mendonorkan darah untuk golongan darah AB+ dan AB-
// Golongan Darah O+ : Bisa mendonorkan darah ke golongan darah O+, A+, B+, dan AB+
// Golongan Darah O- : Bisa mendonorkan darah ke delapan golongan darah