import java.util.Random;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {
				 
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin that number of times.
// String dizzy = JOptionPane.showInputDialog("How dizzy do you want the tortoise to be from 1 to 10?");
// int x = Integer.parseInt(dizzy);
		int x = new Random().nextInt(10);
 // 1. Use the dance method to make the Tortoise spin.
		dance(x);
		 

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
