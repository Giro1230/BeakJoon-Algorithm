package day1;

import java.util.Scanner;

/**
 * 백준 10869번 사칙연산
 * 문제 분류 : 수학, 구현, 사칙연산
 * @author giro
 */

public class No10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
    }
}
