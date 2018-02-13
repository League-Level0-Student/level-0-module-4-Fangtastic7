

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String number1 = JOptionPane.showInputDialog("Give me a number");
		int one = Integer.parseInt(number1);
		String number2 = JOptionPane.showInputDialog("Give me another number");
		int two = Integer.parseInt(number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Calculator", "Simple Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation==0) {
			addition(one, two);
		}
		else if(operation==1) {
			subtraction(one, two);
		}
		else if(operation==2) {
			multiplication(one, two);
		}
		else {
			division(one, two);
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
		
	// 4. Create similar methods for subtraction, multiplication and division.
	static void addition(int one, int two) {
		int total = one + two;
		JOptionPane.showMessageDialog(null, "Answer: " + total);
	}
	static void subtraction(int one, int two) {
		int total = one-two;
		JOptionPane.showMessageDialog(null, "Answer: " + total);
	}
	static void multiplication(int one, int two) {
		double total = one * two;
		JOptionPane.showMessageDialog(null, "Answer: " + total);
	}
	static void division(int one, int two) {
		double total = one / two;
		JOptionPane.showMessageDialog(null, "Answer: " + total);
	}
	}	