import javax.swing.JOptionPane;

public class String_methods1 {
//  Copyright (c) The League of Amazing Programmers 2013-2017
//  Level 0
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
			String name = "bot";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
				System.out.println(name.charAt(2));
		// 3. Print the length of your String to the console.
		//    HINT: .length
				System.out.println(name.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
				for(int i=0; i<name.length();i++) {
					System.out.println(name.charAt(i));
					
				}
				for(int i=0; i<3;i++) {
				String character = JOptionPane.showInputDialog("What character do you want me to tell you it's location in the word?");
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
				if(character.equalsIgnoreCase("b")) {
					System.out.println("b is at index 1.");
				}
				else if(character.equalsIgnoreCase("o")) {
					System.out.println("o is at index 2.");
				}
				else if(character.equalsIgnoreCase("t")) {
					System.out.println("t is at index 3.");
				}
				else {
					System.out.println("That is not part of the word.");
				}
				}
	
}


}
