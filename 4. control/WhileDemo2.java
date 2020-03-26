package control;

import java.util.Scanner;

public class WhileDemo2 {
	public static void main(String[] args) {
		
		// 1부터 숫자를 하나씩 더해갈 때 최초로 500을 넘어
		// 합계가 최초로 500 이상이 되는 숫자는 무엇인가?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int max = sc.nextInt();
		int n = 1;
		int sum = 0;
		
		while(true) {
			sum += n;
			
			if(sum >= max) {
				break;
			}
			n++;
		}
		System.out.println("합계 : " + sum + ", 숫자 : " + n);
	}
}
