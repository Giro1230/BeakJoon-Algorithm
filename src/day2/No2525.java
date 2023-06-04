package day2;

import java.util.Scanner;

/**
 * 백준 2525번 오븐 시계
 * 문제 분류 : 수학, 사칙연산
 * @author giro
 */

public class No2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] timeSplit = time.split(" ");
        int setTime = sc.nextInt();

        int h = Integer.parseInt(timeSplit[0]);
        int m = Integer.parseInt(timeSplit[1]);

        // 시간 범위 지정
        if(h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            m += setTime;
            if (m >= 60) {
                h += m / 60;
                if (h >= 24) {
                    h -= 24;
                }
                m = m % 60;
            }
        }

        System.out.println(h + " " + m);
        sc.close();
    }
}
