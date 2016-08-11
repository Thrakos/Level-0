import java.util.Random;

import javax.swing.JOptionPane;
public class FizzBuzz {
	public static void main(String[] args) {
		int Num1 = new Random().nextInt(10) + 1;
		int Num2 = new Random().nextInt(10) + 1;
		String answer = "";
		for (int i = 1; i < 21; i++) {
			if (i % Num1 == 0 && i % Num2 == 0) {
				answer = answer + "FizzBuzz, ";
			} else if (i % Num1 == 0) {
				answer = answer + "Fizz, ";

			} else if (i % Num2 == 0) {
				answer = answer + "Buzz, ";
			} else {
				answer = answer + i + " ";
			}

		}
		JOptionPane.showMessageDialog(null, answer);
	}
}
