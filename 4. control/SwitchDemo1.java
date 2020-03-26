package control;

import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String[] args) {
		/*
		switch문
		비교값과 일치하는 다양한 경우를 간결한 표현으로 처리할 수 있음
		
		switch(비교값) {
			case 값1 :
				비교값이 값 1과 일치하는 경우 실행되는 수행문;
			case 값2 :
				비교값이 값 2과 일치하는 경우 실행되는 수행문;
			default :
				비교값이 제시된 값이 일치하는 것이 없을 때 실행되는 수행문;
		}
		
		비교값으로 사용가능한 값은 정수, 문자, 문자열만 가능
		case에 제시된 값은 상수 or 리터럴
		 ㄴ 상수final로 직접 적거나  리터럴 값으로 직접 적지 않으면 안됨
		
		
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급을 입력하세요 : ");
		String grade = sc.next();
		
		switch(grade) {
			case "vvip" : 
				System.out.println("vvip 고객님 방문을 환영합니다");
				System.out.println("금일은 한정판 포도주 증정이 있습니다");
				break; // break없으면 아래 라인들도 전부 실행됨
			case "vip" : 
				System.out.println("vip 고객님 방문을 환영합니다");
				System.out.println("금일은 한정판 식기세트 증정이 있습니다");
				break;
			case "classic" : 
				System.out.println("classic 고객님 방문을 환영합니다");
				System.out.println("금일은 마스크 증정이 있습니다");
				break;
			default : 
				System.out.println("고객님 방문을 환영합니다");
				System.out.println("금일은 100분 한정 주차권 증정이 있습니다");
				// break; default에는 필요 없음
		}
		
		// if 사용시
		if(grade.equals("vvip")) {
			System.out.println("vvip 고객님 안녕히가세요");
		} else if(grade.equals("vip")) {
			System.out.println("vip 고객님 안녕히가세요");
		} else if(grade.equals("classic")) {
			System.out.println("classic 고객님 안녕히가세요");
		} else {
			System.out.println("고객님 안녕히가세요");
		}
		
		
	}
}
