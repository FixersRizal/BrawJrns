import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // jangan dihapus
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String cleanedInput = input.replaceAll("[{}]", "");
        String[] stringArray = cleanedInput.split(",\\s*");
        int[] arr = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            arr[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.println(findMaxEven(arr));
    }

    public static int findMaxEven(int[] arrAngka) {
        int a = -1;
        for (int angka : arrAngka) {
            if (isEven(angka)) {
                if (a == -1 || angka > a) {
                    a = angka;
                }
            }
        }
        return a;
    }

    public static boolean isEven(int angka) {
        return angka % 2 == 0;
    }
}