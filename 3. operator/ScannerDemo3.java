package operator;

import java.util.Scanner;

public class ScannerDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		고객명, 상품명, 가격, 구매수량, 사용포인트를 입력받는다
		출력내용
			고객명, 상품명, 가격, 구매수량, 구매가격, 사용포인트, 결제금액, 적립포인트
			사용포인트는 고객이 이미 적립한 포인트가 있다고 가정하며, 임의의 값을 입력받는다
			결제금액은 구매가격에서 포인트 사용량을 제외한 금액이다
			적립포인트는 실결제금액의 3%
		*/
		
		System.out.print("고객 이름을 입력하세요 : ");
		String customer = sc.next();
		System.out.print("상품명을 입력하세요 : ");
		String product = sc.next();
		System.out.print("가격을 입력하세요 : ");
		int price = sc.nextInt();
		System.out.print("구매수량을 입력하세요 : ");
		int amount = sc.nextInt();
		System.out.print("사용포인트를 입력하세요 : ");
		int usedPoint = sc.nextInt();
		
		int total = price * amount; // 구매가격
		int payTotalPrice = total - usedPoint; // 실결제금액
		int point = (int) (payTotalPrice * 0.03); // 적립포인트
		
		System.out.println();
		System.out.println("ㅡㅡㅡㅡㅡ결제내역ㅡㅡㅡㅡㅡ");
		System.out.println("고객명 : " + customer);
		System.out.println("상품명 : " + product);
		System.out.println("가격 : " + price);
		System.out.println("구매수량 : " + amount);
		System.out.println("구매가격 : " + total);
		System.out.println("사용포인트 : " + usedPoint);
		System.out.println("결제금액 : " + payTotalPrice);
		System.out.println("적립포인트 : " + point);
		
		
	}
}
