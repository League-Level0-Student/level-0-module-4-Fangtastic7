import javax.swing.JOptionPane;

public class Own_Adventures {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"You wake in an empty room. You don't how you got into the room, but you are are stranded. The only way out of the room is through one of the doors.");
		String answer1 = JOptionPane.showInputDialog(null, "Which door do you want to enter through? The black or white one?");
		
		if(answer1.equalsIgnoreCase("black")) {
			JOptionPane.showMessageDialog(null, "So you chose the black one, huh?!");
			String direction = JOptionPane.showInputDialog("Now which way do you want to precede? Right or left?");
			if(direction.equalsIgnoreCase("right")) {
				JOptionPane.showMessageDialog(null, "You went right!");
				JOptionPane.showMessageDialog(null, "Nobody's made it this far.");
				JOptionPane.showMessageDialog(null, "Just kiddin. You are normal right now, normal to suffer.");
				System.exit(0);
			}
			else if(direction.equalsIgnoreCase("left")){
				JOptionPane.showMessageDialog(null, "Very well, follow me. ");
				JOptionPane.showMessageDialog(null, "People who usually come this way don't comeback.");
				String updown = JOptionPane.showInputDialog( "Up or down the ladder?");
				if(updown.equalsIgnoreCase("up")) {
					JOptionPane.showMessageDialog(null, "You blew up.");
					System.exit(0);
				}
				else if(updown.equalsIgnoreCase("down")) {
					JOptionPane.showMessageDialog(null, "That's where you will go down.");
					System.exit(0);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Eh, you want to go there? I will show you the true path of the dark side."); 
				JOptionPane.showMessageDialog(null, "Let me take you somewhere...");
				playVideo("https://www.youtube.com/watch?v=wbWOVfY-rxU");
				System.exit(0);
			}
		}
		
		else if(answer1.equalsIgnoreCase("white")) {
			JOptionPane.showMessageDialog(null, "The white one I see.");
			String location = JOptionPane.showInputDialog("Now, now, what location do you wish to teleport to? The attic or the dungeon?");
			if(location.equalsIgnoreCase("attic")) {
				JOptionPane.showMessageDialog(null, "Attic, the attic right. I will take you there in just a moment.");
				JOptionPane.showMessageDialog(null, "Follow me.");
			}
			else if(location.equalsIgnoreCase("dungeon")) {
				JOptionPane.showMessageDialog(null, "Are you crazy! That's suicide!");
				int response = JOptionPane.showConfirmDialog(null, "You sure you still want to go?");
				if(response==1) {
					JOptionPane.showMessageDialog(null, "Good choice. Now to the attic then.");
					int response1 = JOptionPane.showConfirmDialog(null, "The attic is very dark and empty. Do you still want to go?");
					if(response1==1) {
						JOptionPane.showMessageDialog(null, "Good choice. Very well down to the living room.");
					}
						else if(response1==2) {
							JOptionPane.showMessageDialog(null, "You see nothing in this room. All you see is a dark, empty room.");
							JOptionPane.showMessageDialog(null, "This place is for prisoners and strangers who come to my property. People like you.");
							System.exit(0);
						}
					}
				
			else if(response==2) {
					JOptionPane.showMessageDialog(null, "You have been eaten by unfriendly monsters.");
					System.exit(0);
					
				}
			}
		}
		
		else {
			JOptionPane.showMessageDialog(null, "Why didn't you choose a door?");
			JOptionPane.showMessageDialog(null, "you probably spelled the color wrong or you probably just don't want to be here at all.");
			JOptionPane.showMessageDialog(null, "So be it young mortal. You shall be plunged to the depths of hell.");
			System.exit(0);
		}
	}

	private static void playVideo(String string) {
		// TODO Auto-generated method stub
		String string1 = "https://www.youtube.com/watch?v=wbWOVfY-rxU";
	}

	
}
