import javax.swing.JOptionPane;

public class ChangeCalc {
	public static void main(String[] args) {
		double totalMoney = 0;
		String nickelsString = JOptionPane.showInputDialog("How many nickels do you have now?");
		String dimesString = JOptionPane.showInputDialog("How many dimes do you have now?");
		String quartersString = JOptionPane.showInputDialog("How many quarters do you have now?");
		double nickels = Integer.parseInt(nickelsString);
		double dimes = Integer.parseInt(dimesString);
		double quarters = Integer.parseInt(quartersString);
		System.out.println(nickels);
		System.out.println(dimes);
		System.out.println(quarters);
		totalMoney = ((nickels * 5) + (dimes * 10) + (quarters * 25)) / 100;
		JOptionPane.showMessageDialog(null, "You have $" + totalMoney);

	}
}
