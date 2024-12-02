import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Person {
    private String nama;
    private int umur;

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public String getName() {
        return nama;
    }
    public int getAge() {
        return umur;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int umur = scanner.nextInt();
        scanner.nextLine();
        String nama = scanner.nextLine();
        Person person = new Person(nama, umur);
        System.out.println("Nama: " + person.getName());
        System.out.println("Umur: " + person.getAge());
    }
}