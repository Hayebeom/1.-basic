package operator;

public class OpDemo7 {
	public static void main(String[] args) {
		// 논리연산자(이항 연산자)
		// && 	||	 !
		// and 	or 	not
		// 논리연산자의 피연산자는 boolean값을 제공하는 연산식이어야 함 (혹은 표현식)
		// 논리연산자의 연산 결과는 항상 true/false 중에 하나
		// 논리연산자는 업무 로직의 구현에 필수적으로 사용됨
		
		// 주행거리가 50000km 이상이거나 구입기간이 5년이 넘은 경우 유상처리
		int distance = 60000;
		int usedYear = 3;
		boolean isPay = distance >= 50000 || usedYear > 5;
		boolean isPay2 = !(distance < 50000 && usedYear < 5);
		System.out.println("유상수리여부 : " + isPay);
		System.out.println("유상수리여부 : " + isPay2);

		// 당일 구매금액이 10만원 이상이고, 100번째, 200번째, 300번째, ... 에
		// 방문한 고객은 사은품을 지급한다 (AND 결합
		int orderPrice = 140000;
		int count = 157; // 157번째 방문자
		boolean isGift = orderPrice >= 1000000 && (count%100 == 0);
		System.out.println("사은품 지급 여부 : " + isGift);
		
		// 시험성적이 90점 이상이고, 학년석차가 3등 이내인 학생에게 전액 장학금을 지원(AND 결합)
		int score = 94;
		int ranking = 2;
		boolean isScholarship = score >= 90 && (ranking >= 1 && ranking <= 3);
		System.out.println("장학금 지원 여부 : " + isScholarship);
		
		String message = "안녕하세요";
		boolean empty = message.isEmpty();
		System.out.println("메시지가 없습니까? " + empty);
		System.out.println("메시지가 있습니까? " + !empty);
		
	}
}
