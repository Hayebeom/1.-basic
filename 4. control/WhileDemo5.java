package control;

public class WhileDemo5 {
	public static void main(String[] args) {
		// 1 + (-2) + 3 (-4) + 5 .... 총합 100이 되는 횟수 count
		
		int sum = 0;
		int n = 1;
		
		while (true) {
			// n의 값이 홀수면 sum에 그냥 더하고, 아니면 -1을 곱한 후 더한다
			// sum의 값이 100 이상이면 탈출
			// n의 값을 1 증가시킨다
			
			if(n % 2 == 0) {
				sum += n *-1;
			} else {
				sum += n;
			}

			if (sum >= 100) {
				break;
			}
			
			n++;
		}
		System.out.println("총합 100이 넘는 첫번째 수 : " + n);


	}
	
}

/* ★
sum += number * (-1) // -2
number = number * (-1) 
sum += number // -1
 이유 ?  참조와 변경의 차이
*/