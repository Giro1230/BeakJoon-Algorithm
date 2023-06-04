package day1;

import java.util.Scanner;

/**
 * 백준 10430번 나머지
 * 문제 분류 : 수학, 구현, 사칙연산
 * @author giro
 */

public class No10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a * b)%c);
        System.out.println(((a%c) * (b%c))%c);
        sc.close();
    }
}
