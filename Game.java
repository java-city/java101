import javax.swing.*;

public class Game {

	public static void main(String args[]) {

		//int wins=0, losses=0, ties = 0;
		String clientGesture = null;
		String serverGesture = "rock";
		Score score = new Score();
		
		do {
			String prompt = "Will it be rock, paper or scissors?";
			clientGesture = JOptionPane.showInputDialog(prompt);
			//clientGesture = input;
			String result = "error";

			if (clientGesture.equalsIgnoreCase("rock")) {
				result = "tie";
				score.increaseTies();
			}

			if (clientGesture.equalsIgnoreCase("scissors")) {
				result = "lose";
				score.increaseLosses();
			}

			if (clientGesture.equalsIgnoreCase("paper")) {
				result = "win";
				score.increaseWins();
			}
			JOptionPane.showMessageDialog(null, result);
			
			Game.displayResults(score);
			
		} while (!clientGesture.equalsIgnoreCase("q"));
	}
	
	public static void displayResults(Score s){
		System.out.println("\nWins: " + s.getWins()
		+ "\tLosses: "+ s.getLosses()
			+ "\tTies: " + s.getTies());
		
	}
	
	
}
