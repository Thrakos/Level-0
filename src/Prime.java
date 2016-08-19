import javax.swing.JOptionPane;

public class Prime {
	public static void main(String[] args) {
		String divisors = "";
		boolean prime = true;
		String numString = JOptionPane.showInputDialog("enter a number");
		int num = Integer.parseInt(numString);
		for(int i = num - 1; i > 1; i--){
			if(num % i == 0){
				prime = false;
				divisors = divisors  + i+ ", ";

			}
		}
		if(prime == true){
			JOptionPane.showMessageDialog(null, num + " is a prime number");
		}
		else{
			JOptionPane.showMessageDialog(null, num + " is a composite number. \n"
					+ "The divisors are " + divisors);
		}

	}
}
