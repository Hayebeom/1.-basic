package control;

public class Lotto3 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;
		
		int num = 0;
		
		for(int i=1; i<=6; i++) {
			num = (int) (Math.random() * 45 + 1);
			
			if (num == n1 || num == n2 || num == n3 || num == n4 || num == n5 || num == n6 ) {
				// num이 n1과 일치하거나....n6과 일치하거나(OR)
				// 지금 발행된 숫자와 동일한 숫자가 이미 존재하고 있음
				i--; // 안쓰면 i가 + 되버림
				// if문 나가서 다시 for문에서 + 되서 다시 if문으로 돌아옴
			} else {
				// 지금 발행된 숫자와 동일한 숫자가 존재하지 않음
				// i의 값에 따라서 적절한 변수에 지금 발행된 난수를 저장
				if (i==1) {
					n1 = num;
				} else if (i==2) {
					n2 = num;
				} else if (i==3) {
					n3 = num;
				} else if (i==4) {
					n4 = num;
				} else if (i==5) {
					n5 = num;
				} else if (i==6) {
					n6 = num;
				}
			}
			
		}
		
	}
}
