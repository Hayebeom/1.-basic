package control;

import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		고객의 등급(일반, 로얄, 플래티넘 중 하나)과 총구매금액을 입력받는다.
		고객의 등급이 플래티넘인 경우 구매금액의 10%를 할인한다
				 로얄인 경우 구매금액의 3%를 할인한다
				 일반인 경우 구매금액의 1%를 할인한다
		결제금액은 총구매금액에서 할인된 금액만큼을 차감한 금액이다
		적립포인트는 결제금액의 3%를 적립한다
		
		출력내용
			총구매금액, 고객등급, 할인된 금액, 결제할 금액, 적립된 포인트
		*/
		
		System.out.print("총구매금액을 입력하세요 : ");
		int cash = sc.nextInt();
		System.out.print("고객의 등급을 입력하세요 : ");
		String customer = sc.next();

		double dis = 0; // 할인률
		int point = 0; // 할인된 금액
		int real = 0; // 실결재할 금액
		double stack = 0; // 적립된 포인트

		if (customer.equals("플래티넘")) {
			dis = 0.1;
		} else if (customer.equals("로얄")) {
			dis = 0.03;
		} else if (customer.equals("일반")) {
			dis = 0.01;
		}
		
		point = (int) (dis * cash); // (int) dis * cash 가 아니라;
		real = cash - point;
		stack = real * 0.03;
		
		System.out.println("총구매금액 : " + cash);
		System.out.println("고객등급 : " + customer);
		System.out.println("할인된 금액: " + point);
		System.out.println("결제할 금액 : " + real);
		System.out.println("적립된 포인트 : " + stack);
		
	}
}
