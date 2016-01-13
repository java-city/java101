
public class Score {
	
	private int wins;
	private int losses;
	private int ties;
	
	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public int getTies() {
		return ties;
	}


	
	public void increaseWins(){
		wins++;
	}
	
	public void increaseLosses(){
		losses++;
	}
	
	public void increaseTies(){
		ties++;
	}

}
