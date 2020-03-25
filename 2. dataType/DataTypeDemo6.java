package datatype;

public class DataTypeDemo6 {
	public static void main(String[] args) {
		// 문자열 결합하기
		/*
		 문문자열과 +연산자가 같이 사용될 때는 
		 문자열과 해당 값이 결합되서 새로운 문자열이 만들어진다
		// "문자열1" + "문자열2" -> "문자열1문자열2"
		// "문자열" + 3 -> "문자열3"
		// 3 + "문자열" -> "3문자열"
		// 3 + 3 + "문자열 -> "6문자열"
		// "문자열" + 3 + 3 -> "문자열33"
		 => 문자열과 더하게 되면 무조건 문자열이 됨 (빼기는 안됨)
		 자동 형 변환은 아님(모두 동일하게 일어나는게 아니고 덧셈에만 적용되기 때문)
		 */
		
		String str1 = "안녕하세요, ";
		String str2 = "홍길동님";
		String str3 = str1 + str2;
		System.out.println(str1 + str2);
		System.out.println(str3);
		
		String str4 = "국어점수: ";
		int kor = 80;
		int eng = 70;
		int math = 100;
		int total = kor + eng + math;
		String str5 = str4 + kor; // "국어점수 : " + 80 -> "국어점수 : " + "80" -> "국어점수 : 80"
		System.out.println(str5);
		
		System.out.println("총점 : " + kor + eng + math); 	// "총점 : 8070100"
		System.out.println("총점 : " + (kor + eng + math)); 	// "총점 : 250"
		System.out.println("총점 : " + total); 				// "총점 : 250"
		
	}
}
