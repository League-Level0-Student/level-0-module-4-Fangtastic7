import javax.swing.JOptionPane;

public class Test_Scores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What is your test score?");
	int score1 = Integer.parseInt(score);
	if(score1>100) {
		JOptionPane.showMessageDialog(null, "You are truly amazing! Your mama will give you big hug!");
	}
	else if(score1==100) {
		JOptionPane.showMessageDialog(null, "Good job! You will not get punished!");
	}
	else if(score1>90) {
		JOptionPane.showMessageDialog(null, "You studied. Good job.");
	}
	else if(score1<90) {
		JOptionPane.showMessageDialog(null, "Why you fail! Go back to your room to study more!");
	}
	
}
}
