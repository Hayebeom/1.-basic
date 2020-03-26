package control;

import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String[] args) {
		
		/*
		while (조건식) {
			조건식 = true로 판정된 동안 실행되는 수행문;
		*/
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 (0 입력시 종료) : ");
			int number = sc.nextInt();
			
			// 무한반복 탈출조건
			if(number == 0) {
				System.out.println("종료");
				break;
			}
			
			System.out.println("입력한 번호는 " + number);
		}
	}
}
