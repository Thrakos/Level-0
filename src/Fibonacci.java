public class Fibonacci {
	public static void main(String[] args) {
		int Num1 = 0;
		int Num2 = 1;
		System.out.println(Num1);
		System.out.println(Num2);
		for (int i = 0; i < 21; i++) {
			System.out.println(Num1 + Num2);
			if (Num1 < Num2) {
				Num1 = Num1 + Num2;

			} else {
				Num2 = Num1 + Num2;
			}

		}

	}
}
