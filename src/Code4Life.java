import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {
		

	/*
	 * Ask the user how many hours they spent coding this week.

	 * 1. If it's 3 or more, tell them they're a Code Ninja.
	 * 
	 * 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
	 * 
	 * 3. If it's more than 5, play the Batman theme song.
	 */
String hoursofcode = JOptionPane.showInputDialog("How many hours did you code this week?");
int hourscoded = Integer.parseInt(hoursofcode);
if (hourscoded >= 3 && hourscoded < 5) {
	JOptionPane.showMessageDialog(null, "You are a code ninja. Yay.");
	
}
else if (hourscoded >= 5) {
	playBatmanTheme();
	
}
else if (hourscoded < 3) {
	JOptionPane.showMessageDialog(null, "Stop watching YouTube and start coding");
	
}
	}

	private static void playBatmanTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
