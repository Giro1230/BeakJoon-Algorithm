package day1;

import java.util.Scanner;

/**
 * 백준 18108번 1998년생인 내가 태국에서는 2541년생?!
 * 문제 분류 : 수학, 사칙연산
 * @author giro
 */

public class No18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(x - 543);
        sc.close();
    }
}
