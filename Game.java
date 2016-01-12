import javax.swing.*;
/*
 * The code runs, but there is an error in logic in the code. What's the error?
 * Add five new variables:
 * 		wins
 * 		losses
 * 		ties
 * 		clientGesture
 * 		serverGesture
 * 
 * When the game completes, print out a summary, such as:
 * 
 * You picked rock.
 * Server picked rock.
 * This was a tie.
 * 
 * Here is the summary so far:
 * wins: 3
 * ties: 0
 * losses:5
 * 
 */
public class Game {

	public static void main(String args[]) {

		String input = "";
		do {
			String prompt = "Will it be rock, paper or scissors?";
			input = JOptionPane.showInputDialog(prompt);
			String result = "error";

			if (input.equalsIgnoreCase("rock")) {
				result = "tie";
			}

			if (input.equalsIgnoreCase("scissors")) {
				result = "lose";
			}

			if (input.equalsIgnoreCase("paper")) {
				result = "win";
			}
			JOptionPane.showMessageDialog(null, result);
		} while (!input.equalsIgnoreCase("q"));
	}
}
