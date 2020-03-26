package control;

import java.util.Scanner;

public class Lotto2 {
	public static void main(String[] args) {
		
		/*
		금액을 입력받는다
		금액은 1000원 단위의 값만 입력받는다
		로도 번호를 입력된 금액만큼 발행한다
		1000원당 1세트씩 발행한다
		*/

		System.out.print("금액을 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();
		int count = 0;
		int lotto = 0;
		
		count = money / 1000;
		
		
		for (int i=1; i<=count*6; i++) {
			lotto = (int) (Math.random() * 45 + 1);
			System.out.print(lotto + " ");
			
			if(i%6==0) {
				System.out.println();
			}
		}
		
		int don = money - count * 1000;
		
		System.out.println("잔돈 : " + don);
		

	}
}


/* 내 이중 풀이
package control;

import java.util.Scanner;

public class Lotto2 {
	public static void main(String[] args) {
		
		금액을 입력받는다
		금액은 1000원 단위의 값만 입력받는다
		로도 번호를 입력된 금액만큼 발행한다
		1000원당 1세트씩 발행한다
		
		
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();
		int much = money / 1000;

		if (much >= 1) {

			for (int i = 0; i < much; i++) {
				for (int j = 0; j < 6; j++) {
					int lotto = (int) (Math.random() * 45 + 1);
					System.out.print(lotto + " ");
				}
				System.out.println();
			}

		} else {
			System.out.println("금액이 부족합니다");
		}

	}
}

*/
