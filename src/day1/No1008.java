package day1;

import java.util.Scanner;

/**
 * 백준 1008번 A/B
 * 문제 분류 : 수학, 구현, 사칙연산
 * @author giro
 */

public class No1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x / y);
        sc.close();
    }
}
