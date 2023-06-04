package day1;

import java.util.Scanner;

/**
 * 백준 2588번 곱셈
 * 문제 분류 : 수학, 사칙연산
 * @author giro
 */

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
