package operator;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		학생이름, 국어점수, 영어점수, 수학점수를 입력받는다
		출력내용
			학생이름, 국어점수, 영어점수, 수학점수, 총점, 평균, 합격여부, 장학금 지급여부
			합격여부는 평균이 60점 이상인 경우만 "예"로 출력, 그 외는 "아니오" 출력
			장학금 지급여부는 평균이 96점 이상인 경우만 "예"로 출력, 그 외는 "아니오" 출력
		*/
		
		System.out.print("학생이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		int count = 3;
		int total = kor + eng + math;
		int avg = total/count;
		String passed = (avg >= 60 ? "예" : "아니오");
		String scholarship = (avg >= 96 ? "예" : "아니오");		
		
		System.out.println("ㅡㅡㅡㅡ성적ㅡㅡㅡㅡ");		
		System.out.println("학생 이름 : " + name);
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);	
		System.out.println("합격 여부 : " + passed);
		System.out.println("장학금 지급 여부 : " + scholarship);
		
	}
}
