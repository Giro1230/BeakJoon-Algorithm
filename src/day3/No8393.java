package day3;

import java.util.Scanner;

/**
 * 백준 8393번 합
 * 문제 분류 : 수학, 구현
 * @author giro
 */

public class No8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int val = 0;

        for (int i = 1; i <= t; i++) {
            val += i;
        }

        sc.close();

        System.out.println(val);
    }
}
