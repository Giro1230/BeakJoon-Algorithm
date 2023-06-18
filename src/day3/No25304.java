package day3;

import java.util.Scanner;

/**
 * 백준 8393번 영수증
 * 문제 분류 : 수학, 구현, 사칙연산
 * @author giro
 */

public class No25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalMoney = sc.nextInt();
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int itemPrice = sc.nextInt();
            int itemCount = sc.nextInt();

            totalMoney = totalMoney - (itemPrice * itemCount);
        }

        sc.close();

        if (totalMoney == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
