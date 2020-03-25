package datatype;

public class DataTypeDemo8 {
	public static void main(String[] args) {
		// 반지름의 길이가 5, 10, 20인 원들이 있다
		// 각 원들의 넓이와 원의 둘레 길이를 계산해서 출력
		// 넓이는 3.14*반지름*반지름
		// 둘레길이는 2*3.14*반지름
		
		int a = 5;
		int b = 10;
		int c = 20;
		
		double circleArea1 = Math.PI * a * a;
		double circleArea2 = Math.PI * b * b;
		double circleArea3 = Math.PI * c * c;
		
		double circleRound1 = 2 * Math.PI * a;
		double circleRound2 = 2 * Math.PI * b;
		double circleRound3 = 2 * Math.PI * c;
		
		System.out.println("a 원의 넓이 : " + circleArea1 + "   " + "a 원의 둘레 : " + circleRound1);
		System.out.println("b 원의 넓이 : " + circleArea2 + "   " + "b 원의 둘레 : " + circleRound2);
		System.out.println("c 원의 넓이 : " + circleArea3 + "   " + "c 원의 둘레 : " + circleRound3);
		
	}
}

