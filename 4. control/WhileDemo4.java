package control;

import java.util.Scanner;

public class WhileDemo4 {
	public static void main(String[] args) {
		// 10000 ~ 99999 사이의 임의의 정수를 입력하세요
		// 예) 입력값 : 12132 ---> 출력값 1 + 2 + 1 + 3 + 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 5자리 숫자를 입력하세요 (10000 ~ 99999) : ");
		int n = sc.nextInt();
		int sum = 0;
		
		while (true) {
			if (n > 0) {
				sum = sum + (n%10);
				n = n/10;
			} else {
				System.out.println("각 자리 숫자의 합 : " + sum);
				break;
			}
		}
		
		
	}
}
