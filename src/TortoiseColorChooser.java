
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {
			Tortoise.setPenWidth(10);
			Tortoise.hide();
			Tortoise.penDown();
			Tortoise.setSpeed(10);
		for (int i = 0; i < 10; i++) {
			Tortoise.turn(36);

			String color = JOptionPane.showInputDialog("What color do you want the star?");

			chooseColor(color);

			drawStar();
		}
	}

	private static void chooseColor(String color) {
		if (color.equals("blue")) {
			Tortoise.setPenColor(PenColors.Blues.Blue);
		} else if (color.equals("red")) {
			Tortoise.setPenColor(PenColors.Reds.Red);
		} else if (color.equals("green")) {
			Tortoise.setPenColor(PenColors.Greens.Green);
		} else if (color.equals("orange")) {
			Tortoise.setPenColor(PenColors.Oranges.Orange);
		} else if (color.equals("yellow")) {
			Tortoise.setPenColor(PenColors.Yellows.Yellow);
		} else if (color.equals("purple")) {
			Tortoise.setPenColor(PenColors.Purples.Purple);
		} else if (color.equals("")) {
			Tortoise.setPenColor(PenColors.getRandomColor());
		} else {
			Tortoise.setPenColor(PenColors.getRandomColor());
		}
	}

	private static void drawStar() {
		for (int t = 0; t < 5; t++) {
			Tortoise.move(200);
			Tortoise.turn(144);

		}
	}
}
