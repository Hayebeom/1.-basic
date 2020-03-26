package control;

import java.util.Scanner;

public class ForDemo3 {
	public static void main(String[] args) {
		// 정수 2개를 입력받아서 두 정수 사이의 숫자를 더한 값을 구하기
		// 예) 10 13
		// 		10 + 11 + 12 + 13
		
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int n2 = sc.nextInt();

		int sum = 0;

		if (n1 > n2) {
			for (int i = n2; i <= n1; i++) {
				sum += i;
			}

		} else if (n1 < n2) {
			for (int i = n1; i <= n2; i++) {
				sum += i;
			}
		} else {
			System.out.println("두 정수가 같습니다.");
		}

		System.out.println(sum);
	}
}
