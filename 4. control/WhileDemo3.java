package control;

import java.util.Scanner;

public class WhileDemo3 {
	public static void main(String[] args) {
		// 1~100까지의 임의의 정수를 하나 생성
		// 사용자가 입력한 숫자와 임의의 정수를 비교해서 up / down 표시
		// 사용자가 입력한 숫자와 임의의 정수가 일치하면 몇번만에 맞췄는지 화면에 표시
		
		Scanner sc = new Scanner(System.in);
		
		int answer = 0;
		int ran = (int) (Math.random()*100 + 1);
		int count = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			answer = sc.nextInt();
			count++;

			if(ran > answer) {
				System.out.println("입력한 숫자보다는 큽니다.");
			} else if (ran < answer){
				System.out.println("입력한 숫자보다는 작습니다");
			} else {
				System.out.println();
				System.out.println("정답 : " + ran);
				System.out.println("입력한 횟수 : " + count);
				break;
			}
		}
		
		
	}
}
