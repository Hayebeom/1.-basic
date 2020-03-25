package datatype;

public class DataTypeDemo7 {
	public static void main(String[] args) {
		// 변수 활용하기
		
		// 본인의 이름, 전화번호, 이메일, 나이, 키, 몸무게, 혈액형, 결혼여부를 저장하는 변수 선언
		// 해당값을 각 변수에 저장, 각 변수에 저장된 값을 출력

		String name = "하예범";
		String tel = "010-8943-0323";
		String email = "hayeibum1201@naver.com";
		int age = 26;
		double height = 176; // 소수점도 생각
		double weight = 73.5; // 소수점도 생각
		String bloodtype = "A"; // char는 ab형 때문에 안됨
		boolean isMarried = false;
		
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + tel);
		System.out.println("이메일 : " + email);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("혈액형 : " + bloodtype);
		System.out.println("결혼여부 : " + isMarried);
		
	}
}
