package day3;

import java.util.Scanner;

/**
 * 백준 1330번 구구단
 * 문제 분류 : 수학, 구현
 * @author giro
 */

public class No2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(x + " * " + i + " = " + (x*i));
        }
    }
}
