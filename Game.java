import javax.swing.*;

public class Game {

	public static void main(String args[]) {

		int wins=0, losses=0, ties = 0;
		String clientGesture = null;
		String serverGesture = "rock";
		
		do {
			String prompt = "Will it be rock, paper or scissors?";
			clientGesture = JOptionPane.showInputDialog(prompt);
			//clientGesture = input;
			String result = "error";

			if (clientGesture.equalsIgnoreCase("rock")) {
				result = "tie";
				ties++;
			}

			if (clientGesture.equalsIgnoreCase("scissors")) {
				result = "lose";
				losses = losses + 1;
			}

			if (clientGesture.equalsIgnoreCase("paper")) {
				result = "win";
				wins++;
			}
			JOptionPane.showMessageDialog(null, result);
			System.out.println("\nWins: " + wins + "\tLosses: "+ losses + "\tTies: " + ties);
		} while (!clientGesture.equalsIgnoreCase("q"));
	}
}
