package day2;

import java.util.Scanner;

/**
 * 백준 2753번 윤년
 * 문제 분류 : 구현
 * @author giro
 */


public class No2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if((x % 4) == 0 && (x % 100) != 0 || (x % 400) == 0) System.out.println(1);
        else System.out.println(0);
        sc.close();
    }
}
