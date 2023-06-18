package day3;

import java.util.Scanner;

/**
 * 백준 10950번 A+B-3
 * 문제 분류 : 수학, 구현, 사칙연산
 * @author giro
 */

public class No10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] A = new int[t];
        int[] B = new int[t];

        for (int i = 0; i < t; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < t; i++) {
            System.out.println(A[i] + B[i]);
        }
    }
}
