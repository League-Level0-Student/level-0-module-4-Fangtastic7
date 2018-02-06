//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	static // 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
		int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=0;i<6;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Pet choices", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go for a walk", "Give water", "Give it a rub" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task==0) {
				JOptionPane.showMessageDialog(null, "Your " + pet + " companion enjoys the good exercise!");
				walk();
			}
			else if(task==1) {
				JOptionPane.showMessageDialog(null, "Your " + pet + " enjoys a delightful, refreshing drink!");
				water();
			}
			else {
				JOptionPane.showMessageDialog(null, "Your " + pet + " experiences a lovely rub and gives you a big lick.");
				rub();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel==5) {
				JOptionPane.showMessageDialog(null, "You have given your " + pet + " lots of love and your pet is now fully devoted to you!");
				break;
			}
	}
	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	private static void walk(){
	
		 happinessLevel = happinessLevel + 1;
	}
	private static void water() {
		
		 happinessLevel = happinessLevel+ 1;
	}
	private static void rub() {
		
		 happinessLevel = happinessLevel + 1;
	
	}
}