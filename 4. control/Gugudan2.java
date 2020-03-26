package control;

public class Gugudan2 {
	public static void main(String[] args) {
		
		int dan = 0;
		
		for (int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				dan = i * j;
				System.out.print(j + " * " + i + " = " + dan);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}
