package day2;

import java.util.Scanner;

/**
 * 백준 2525번 주사위 세개
 * 문제 분류 : 수학, 구현, 사칙연산, 많은 조건 분기
 * @author giro
 */

public class No2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dice = sc.nextLine();
        String[] diceSplit = dice.split(" ");

        int x = Integer.parseInt(diceSplit[0]);
        int y = Integer.parseInt(diceSplit[1]);
        int z = Integer.parseInt(diceSplit[2]);

        int money = 0;

        if (x == y && y == z){
            money = 10000 + (x * 1000);
        } else {
            if (x == y) money = 1000 + (x * 100);
            else if (y == z) money = 1000 + (y * 100);
            else if (x == z) money = 1000 + (x * 100);
            else {
                int temp = 0;
                for (String s : diceSplit) {
                    if (temp < Integer.parseInt(s)) {
                        temp = Integer.parseInt(s);
                    }
                }
                money = 100 * temp;
            }
        }

        System.out.println(money);

        sc.close();
    }
}
