package datatype;

public class DataTypeDemo9 {
	public static void main(String[] args) {
		/* 
		홍길동 고객은 3만원짜리 셔츠 3장
		10만원자리 청바지 2장
		50만원자리 구두 1켤레를 구매했다
		홍길동 고객의 총구매금액 출력
		해당 사이트에서는 구매금액의 3%를 포인트로 적립시킨다(포인트는 정수값만 사용)
		홍길동 고객이 이번 주문에서 적립한 포인트 출력
		*/
		
		int shirtPirce = 30000;
		int jeanPirce = 100000;
		int shoesPirce = 500000;
		
		int shirtAmount = 3;
		int jeanAmount = 2;
		int shoesAmount = 1;
		
		int shirtOrderPrice = (shirtPirce * shirtAmount);
		int jeanOrderPrice = (jeanPirce * jeanAmount);
		int shoesOrderPrice = (shoesPirce * shoesAmount);
		
		int totalOrderPrice = shirtOrderPrice + jeanOrderPrice + shoesOrderPrice;
		int depositPoint = (int)(totalOrderPrice * 0.03);
		
		System.out.println("총구매가격 : " + totalOrderPrice + "원");
		System.out.println("적립포인트 : " + depositPoint + "점");
		
	}
}
