package day2;

import java.util.Scanner;

/**
 * 백준 2884번 알람 시계
 * 문제 분류 : 수학, 사칙연산
 * @author giro
 */

public class No2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        // 시간 범위 지정
        if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            if (m < 45){ // 분 단위가 45분 보다 작을때
                if (h == 0){ // 0시 이면
                    h = 24;
                }
                h -= 1;
                m += 60;
            }
        }

        System.out.println(h + " " + (m-45));
        sc.close();
    }
}
