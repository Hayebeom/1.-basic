package control;

import java.util.Scanner;

public class Gugudan1 {
	public static void main(String[] args) {
		// 숫자를 입력받아서 해당숫자에 대한 구구단을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 구구단의 단을 입력하세요 : ");
		int n = sc.nextInt();
		int dan = 0;
		
		for(int i=1; i<=9; i++) {
			dan = n * i;
			System.out.println(n + " * " + i + " = " + dan);
		}

	}
}
