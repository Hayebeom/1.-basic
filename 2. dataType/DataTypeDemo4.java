package datatype;

public class DataTypeDemo4 {
	public static void main(String[] args) {
		
		// 리터럴 : 코드에 직접 값을 표시하는 것
		// 값의 종류에 따라 표기법이 정해져 있다
		
		/*
		// 논리값 리터럴		true false
		// 정수 리터럴		10 1 0 -3 1_000_000 10000000000L 100000000l
		 ㄴ int 범위를 초과하는 값은 뒤에 L(혹은 소문자l)을 붙이면 가능 (long 타입됨)
		// 실수 리터럴		3.14 3.0 3. -5.04 3.14F 3.14f
		// 문자 리터럴		'A' '1' '\n'줄바꿈 '\b'백스페이스 '\t'탭 '\u0042'유니코드
		// ㄴ '\n' => 줄바꿈 
		  	 '\b' => 백스페이스
		     '\t' => 탭
			 '\u0042' => 유니코드
		// 문자열 리터럴		"안녕하세요" "서울특별시 종로구 \n디아망빌딩 401호\nL2강의실"
		*/
		
		/*
		자바의 기본 자료형
		// 논리값 타입		boolean
		// 정수 타입		byte short int long
		// 실수 타입		float double
		// 문자 타입		char

		// 문자열 전용		String
		 ㄴ 문자열은 기본 타입이 아님!
		*/
		
		
		// 각 리터럴별 변수 사용하기
		// 논리값 다루기 : true false는 참/거짓 논리값을 나타내는 자바의 예약어
		boolean	soldOut = true;
		boolean	passed = false;
		System.out.println("true"); // 논리값이 아니다

		// 정수값 다루기	
		byte num1 = 100;
		short num2 = 30000;
		int num3 = 10000000;
		long num4 = 100000000;
		// byte num5 = 232; // byte값의 범위를 초과하기 때문에 오류
		// int num6 = 300000000000; // int값의 범위를 초과하기 때문에 오류
		/*
		long num7 = 300000000000L; // int값의 범위를 초과하는 값을 long에 대입할 때 리터럴에 L을 붙인다
		왜?
		 ㄴ 정수값만 보고 int인줄 알아서 L을 붙여줘야됨
		*/
		int num8 = 012; // 8진수 12가 저장된다 1*8^1 + 2*8^0
		int num9 = 0x12; // 16진수 12가 저장된다 1*16^1 + 2*16^0
		int num10 = 0xA4; //			   10*16^1 + 4*16^0
		System.out.println(num8);
		System.out.println(num9);
		System.out.println(num10);
		
		// 실수값 다루기	
		float value1 = 3.14f; // 실수 리터럴은 double타입으로 판단한다(float)타입으로 판단하도록 double value2 = 3.14;
		double value2 =3.14;
		
		// 문자 다루기
		char ch1 = 'A'; // 문자 A를 대입
		char ch2 = '\u0041'; // 유니코드표에서 0041코에 해당하는 문자를 대입한다
		char ch3 = 65; // 아스키코드표에서 65번에 해당하는 문자를 대입한다
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		// 문자열 다루기	
		// 문자열은 0개 이상의 문자들이 나열되어 있는 것
		String str1 = "A";
		String str2 = "안녕하세요";
		String str3 = "서울특별시 종로구\n봉익동 디아망빌딩\n4층 L2강의실";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}
}
