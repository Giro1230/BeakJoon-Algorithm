package day2;

import java.util.Scanner;

/**
 * 백준 1330번 두 수 비교하기
 * 문제 분류 : 구현
 * @author giro
 */

public class No1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > y) System.out.println(">");
        if(x < y) System.out.println("<");
        if(x == y) System.out.println("==");
        sc.close();
    }
}
