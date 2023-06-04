package day2;

import java.util.Scanner;

/**
 * 백준 9498번 시험성적
 * 문제 분류 : 구현
 * @author giro
 */

public class No9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x >= 90 && x <= 100) System.out.println("A");
        else if(x >= 80 && x <= 89) System.out.println("B");
        else if(x >= 70 && x <= 79) System.out.println("C");
        else if(x >= 60 && x <= 69) System.out.println("D");
        else System.out.println("F");
        sc.close();
    }
}
