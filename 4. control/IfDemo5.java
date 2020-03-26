package control;

public class IfDemo5 {
	public static void main(String[] args) {
		// 중첩 if문
		// if문의 블록 내에 다른 if문을 포함시키는것
		
		/*
		성적표 출력하기
		60점 이상인 경우  합격, 그 외에는 불합격
		단, 합격자 중에서 성적이 100점 이상인 경우 전액 장학금 지급
						 96점 이상인 경우 반액 장학금 지급
		단, 성적이  40점 이하인 경우 다음 회차 응시기회를 박탈
		*/
		
		int score = 80;
		
		if (score >= 60) {
			System.out.println("합격입니다");
			if (score >= 96) {
				System.out.println("반액 장학금이 지급됩니다");
			} else if (score == 100) {
				System.out.println("전액 장학금이 지급됩니다");
			}
		} else {
			System.out.println("불합격입니다");
			if(score <= 40) {
				System.out.println("다음 회차 응시기회가 박탈되었습니다");
			}
		}

		// if를 바깥에 하나 더 놓는 경우 불합자인 경우에도 장학금 지급 여부를 묻기 때문에 낭비
		
	}
}
