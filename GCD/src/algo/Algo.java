package algo;

import java.util.Scanner;

public class Algo {

    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);

        System.out.print("Input num 1: ");
        num1 = s.nextInt();
        System.out.print("Input num 2: ");
        num2 = s.nextInt();

        System.out.println(gcd(num1, num2));
    }

    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }

    }

}
