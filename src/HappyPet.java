//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	static // 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
		int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		
		int pet = JOptionPane.showOptionDialog(null, "What pet do you want to buy?", "Pets", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "dog", "cat", "goldfish" }, null);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=0;i<6;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Pet choices", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Go for a walk", "Give water", "Give food" , "Give it a rub" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task==0) {
				if(pet==2) {
					nowalk();
				}
				walk();
			}
			else if(task==1) {
				if(pet==1) {
					attack();
				}
				water();
			}
			else if(task==2) {
				feed();
			}
			else {
				
				rub();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel==5) {
				JOptionPane.showMessageDialog(null, "You have given your pet lots of love and your pet is now fully devoted to you!");
				break;
			}
	}
	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	private static void walk(){
		JOptionPane.showMessageDialog(null, "Your companion enjoys the good exercise!");
		 happinessLevel = happinessLevel + 1;
	}
	private static void water() {
		JOptionPane.showMessageDialog(null, "Your pet enjoys a delightful, refreshing drink!");
		 happinessLevel = happinessLevel + 1;
	}
	private static void rub() {
		JOptionPane.showMessageDialog(null, "Your buddy experiences a lovely rub and gives you a backflip.");
		 happinessLevel = happinessLevel + 1;
	}
	private static void feed() {
		JOptionPane.showMessageDialog(null, "Munch, Munch Munch. Very quickly and loudly, your buddy finishes the food that you give them.");
		happinessLevel = happinessLevel + 1;
	}
  	private static void nowalk() {
		JOptionPane.showMessageDialog(null, "Your goldfish cannot walk on land! He will struggle!");
		happinessLevel = happinessLevel - 1;
	}
	private static void attack() {
		JOptionPane.showMessageDialog(null, "Cats loathe water!! Your cat attacks you!");
		happinessLevel = happinessLevel - 1;
	}
}