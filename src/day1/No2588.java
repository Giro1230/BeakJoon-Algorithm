package day1;

import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String z = Integer.toString(y);
        String[] a = z.split("");

        for (int i = z.length()-1; 0 <= i; i--) {
            System.out.println(Integer.parseInt(a[i]) * x);
        }

        System.out.println(x * y);
        sc.close();
    }
}
