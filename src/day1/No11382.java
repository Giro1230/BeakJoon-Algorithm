package day1;

import java.util.Scanner;

/**
 * 백준 11382번 꼬마 정민
 * 문제 분류 : 수학, 구현, 사칙연산
 * @author giro
 */

public class No11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong();
        Long y = sc.nextLong();
        Long z = sc.nextLong();

        System.out.println(x + y + z);
        sc.close();
    }
}
